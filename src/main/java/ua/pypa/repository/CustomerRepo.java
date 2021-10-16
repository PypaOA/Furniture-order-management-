package ua.pypa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.pypa.models.Customer;
import ua.pypa.models.User;

public interface CustomerRepo extends JpaRepository<Customer, Long> {

    Customer findAllById(Long id);
}