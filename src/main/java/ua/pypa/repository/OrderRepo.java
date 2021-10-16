package ua.pypa.repository;


import org.springframework.data.repository.CrudRepository;
import ua.pypa.models.OrderC;

import java.util.List;
import java.util.Optional;

public interface OrderRepo extends CrudRepository<OrderC, Long> {
    void deleteById(Long id);
    Optional<OrderC> findById(Long id);
    List<OrderC> findByPhone(String phone);
}
