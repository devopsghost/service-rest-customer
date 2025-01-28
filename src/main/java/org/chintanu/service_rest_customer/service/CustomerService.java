package org.chintanu.service_rest_customer.service;



import org.chintanu.service_rest_customer.entity.Customer;

import java.util.List;

public interface CustomerService {

    public Customer getCustomerById(Integer customerId);
    public List<Customer> getAllCustomers();
}
