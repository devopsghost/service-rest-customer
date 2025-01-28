package org.chintanu.service_rest_customer.controller;

import org.chintanu.service_rest_customer.entity.Customer;
import org.chintanu.service_rest_customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/customers/")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping(path = "hello")
    public ResponseEntity<String> hello() {

        return ResponseEntity.ok("Hello, can you hear me?");
    }

    @GetMapping(path = "{customerId}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("customerId") Integer customerId) {

        System.out.println("Customer Id : " + customerId);
        Customer customer = customerService.getCustomerById(customerId);
        System.out.println("Customer : " + customer);
        return ResponseEntity.ok(customer);
    }

    @GetMapping
    public ResponseEntity<List<Customer>> getAllCustomers() {

        System.out.println("Inside getAllCustomers()");
        long before = System.currentTimeMillis();
        List<Customer> customers = customerService.getAllCustomers();
        long after = System.currentTimeMillis();
        long total = after - before;
        System.out.println("Total time : " + total + " millis");
        return ResponseEntity.ok(customers);
    }
}
