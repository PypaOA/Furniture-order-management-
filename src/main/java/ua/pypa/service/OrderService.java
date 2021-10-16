package ua.pypa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.pypa.models.OrderC;
import ua.pypa.repository.OrderRepo;

@Service
public class OrderService
{
    @Autowired
    OrderRepo orderRepo;


    //updating a record
    public void update(OrderC orderC , Long id)
    {
        orderRepo.save(orderC);
    }
}