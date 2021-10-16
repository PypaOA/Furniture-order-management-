package ua.pypa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.pypa.models.Customer;
import ua.pypa.models.OrderC;
import ua.pypa.models.Role;
        import ua.pypa.models.User;
import ua.pypa.repository.CustomerRepo;
import ua.pypa.repository.UserRepo;

        import java.util.Collections;
        import java.util.Map;

@Controller
@RequestMapping("/customers")
public class AddCustControllers {
    @Autowired
    private CustomerRepo customerRepo;

    @GetMapping("/newB")
    public String registration() {
        return "newB";
    }

    @PostMapping("/newB")
    public String addOrder(Customer customer, Map<String, Object> model) {
        Customer customerFromDb = customerRepo.findAllById(customer.getId());

        if (customerFromDb != null) {
            model.put("message", "Customer exists!");
            return "newB";
        }

        customer.setFirstName(customer.getFirstName());
        customer.setLastName(customer.getLastName());
        //customer.setOrders(Collections.singleton(new OrderC()));
        customerRepo.save(customer);

        return "redirect:/orders";
    }
}