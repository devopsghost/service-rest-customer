package org.chintanu.service_rest_customer.service;

import org.chintanu.service_rest_customer.entity.Customer;
import org.chintanu.service_rest_customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer getCustomerById(Integer customerId) {
        Optional<Customer> customer = customerRepository.findById(customerId);
        return customer.orElse(null);
    }

    @Override
    public List<Customer> getAllCustomers() {

        return customerRepository.findAll();
    }
}
