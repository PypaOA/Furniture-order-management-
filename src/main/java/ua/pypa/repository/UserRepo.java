package ua.pypa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.pypa.models.User;


public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}