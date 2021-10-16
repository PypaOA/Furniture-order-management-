package ua.pypa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.pypa.repository.CustomerRepo;
import ua.pypa.repository.UserRepo;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerRepo customerRepo;

    @GetMapping
    public String userList(Model model) {
        model.addAttribute("customers", customerRepo.findAll());

        return "customerList";
    }

}
