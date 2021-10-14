package repository;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.web.bind.annotation.RequestBody;

import model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Integer> {

}
