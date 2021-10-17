package ua.pypa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.pypa.models.User;


public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}