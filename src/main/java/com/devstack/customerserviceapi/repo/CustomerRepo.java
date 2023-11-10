package com.devstack.customerserviceapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.devstack.customerserviceapi.entity.Customer;

@EnableJpaRepositories
public interface CustomerRepo extends JpaRepository<Customer,Long> {
}
