package controller;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import exception.ResourceNotFoundException;
import model.Player;
import repository.PlayerRepository;


@Controller
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerRepository playerRepository;

    @GetMapping("/signup")
    public String showSignUpForm(Player player) {
        return "add-player";
    }

    @GetMapping("/list")
    public String showUpdateForm(Model model) {
        model.addAttribute("players", playerRepository.findAll());
        return "index";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable(value="id") int player_number, Model model) throws ResourceNotFoundException{
        Player player = playerRepository.findById(player_number).orElseThrow(() -> new ResourceNotFoundException("Invalid Jersey Number:" + player_number));
        model.addAttribute("player", player);
        return "update-player";
    }

    @GetMapping("/delete/{id}")
    public String deletePlayer(@PathVariable(value="id") int player_number, Model model) throws ResourceNotFoundException {
        Player player = playerRepository.findById(player_number).orElseThrow(() -> new ResourceNotFoundException("Player not found: " + player_number));
        playerRepository.delete(player);
        model.addAttribute("players", playerRepository.findAll());
        return "index";
    }

    @PostMapping("/add")
    public String addPlayer(@Validated Player player, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-player";
        }
        playerRepository.save(player);
        return "redirect:list";
    }

    @PostMapping("update/{id}")
    public String updatePlayer(@PathVariable(value="id") int player_number, @Validated Player player, BindingResult result, Model model) {
        if (result.hasErrors()) {
            player.setPlayer_number(player_number);
            return "update-player";
        }
        playerRepository.save(player);
        model.addAttribute("players", playerRepository.findAll());
        return "index";
    }

}
