package com.ind.test.controller;


import com.ind.test.dao.CustomerDAO;
import com.ind.test.entity.Customer;
import com.ind.test.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/list")
    public String listCustomers(Model model){
        List<Customer> theCustomers = customerService.getCustomers();

        model.addAttribute("customers", theCustomers);
        return "customer/list-customers";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model){
        Customer theCustomer = new Customer();
        model.addAttribute("customer", theCustomer);

        return "customer/customer-form";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer){
        customerService.saveCustomer(customer);
        return "redirect:/customer/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("customerId") int id, Model model){
        Customer customer = customerService.getCustomer(id);
        model.addAttribute("customer", customer);
        return "customer/customer-form";
    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam("customerId") int id){
        customerService.deleteCustomer(id);
        return "redirect:/customer/list";
    }
}
