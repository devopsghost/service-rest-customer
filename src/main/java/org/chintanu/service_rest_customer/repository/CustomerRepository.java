package org.chintanu.service_rest_customer.repository;

import org.chintanu.service_rest_customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
