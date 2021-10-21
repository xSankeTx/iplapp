package repository;

import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByEmailAndPassword(String email, String password);
}