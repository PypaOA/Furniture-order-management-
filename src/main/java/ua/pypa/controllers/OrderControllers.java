package ua.pypa.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import ua.pypa.models.OrderC;
import ua.pypa.repository.OrderRepo;


import javax.validation.Valid;
import java.util.Collections;
import java.util.Map;

@Controller
@RequestMapping("/orders")
public class OrderControllers {

    private final OrderRepo orderRepo;

    public OrderControllers(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    //show orders
    @GetMapping()
    public String index(Map<String, Object> model) {
        Iterable<OrderC> orders = orderRepo.findAll();

        model.put("orders",orders);
        return "index";
    }
    //show order(phone)
    @GetMapping("indexPhone/{phone}")
    public String phone(@PathVariable("phone") String phone, Model model) {
        model.addAttribute("orders", orderRepo.findByPhone(phone));
        return "indexPhone";
    }
    //show order(id)
    @GetMapping("/{id}")
    public String index(@PathVariable("id") Long id, Map<String, Object> model) {
        Iterable<OrderC> orders = orderRepo.findAllById(Collections.singleton(id));

        model.put("orders",orders);
        return "show";
    }

    //add new
    @GetMapping("/new")
    public String create(@ModelAttribute("orderC") OrderC orderc){
        return "new";
    }

    @PostMapping()
    public String add(@ModelAttribute("orderC") OrderC orderC, BindingResult bindingResult){

        if (bindingResult.hasErrors())
            return "new";

        orderRepo.save(orderC);

        return "redirect:/orders";
    }

    //edit person
    @GetMapping("/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model){
        model.addAttribute("orderC", orderRepo.findById(id).get());
        return "edit";
    }
    @PostMapping("/{id}/edit")
    public String updateOrder(@ModelAttribute("orderC") @Valid OrderC orderC){

        if(orderC != null){
            orderRepo.save(orderC);
        }

        return "redirect:/orders";
    }

    //delete order
    @PostMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String deleteNote(@PathVariable("id") Long id, Model model
    ) {
        OrderC orderC = orderRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid note Id" + id));
        orderRepo.deleteById(id);
        model.addAttribute("order", orderC);
        return "redirect:/orders";
    }
}





















