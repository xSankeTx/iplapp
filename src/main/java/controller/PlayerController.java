package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
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

    @GetMapping("/list")
    public String showUpdateForm(Model model) {
        model.addAttribute("players", playerRepository.findAll());
        return "index";
    }

    // @GetMapping("/edit/{player_number}")
    // public String showUpdateForm(@PathVariable("player_number") int player_number, Model model) {
    //     Player player = playerRepository.findById(player_number)
    //         .orElseThrow(() -> new IllegalArgumentException("Invalid Jersey Number:" + player_number));
    //     model.addAttribute("player", player);
    //     return "update-player";
    // }

    // @GetMapping("/delete/{player_number}")
    // public String deleteStudent(@PathVariable("player_number") int player_number, Model model) {
    //     Player player = playerRepository.findById(player_number)
    //         .orElseThrow(() -> new IllegalArgumentException("Invalid jersey number:" + player_number));
    //     playerRepository.delete(player);
    //     model.addAttribute("players", playerRepository.findAll());
    //     return "index";
    // }



}
