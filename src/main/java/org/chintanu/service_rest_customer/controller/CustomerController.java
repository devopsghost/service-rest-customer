package org.chintanu.service_rest_customer.controller;

import ch.qos.logback.classic.Logger;
import org.chintanu.service_rest_customer.entity.Customer;
import org.chintanu.service_rest_customer.service.CustomerService;
import org.slf4j.LoggerFactory;
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

    Logger log = (Logger) LoggerFactory.getLogger(this.getClass());

    @Autowired
    CustomerService customerService;

    @GetMapping(path = "hello")
    public ResponseEntity<String> hello() {

        return ResponseEntity.ok("Hello, can you hear me?");
    }

    @GetMapping(path = "{customerId}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("customerId") Integer customerId) {

        log.info("Customer Id : " + customerId);
        Customer customer = customerService.getCustomerById(customerId);
        log.info("Customer : " + customer);
        return ResponseEntity.ok(customer);
    }

    @GetMapping
    public ResponseEntity<List<Customer>> getAllCustomers() {

        log.info("Inside getAllCustomers()");
        long before = System.currentTimeMillis();
        List<Customer> customers = customerService.getAllCustomers();
        long after = System.currentTimeMillis();
        long total = after - before;
        log.info("Total time : " + total + " millis");
        return ResponseEntity.ok(customers);
    }
}
