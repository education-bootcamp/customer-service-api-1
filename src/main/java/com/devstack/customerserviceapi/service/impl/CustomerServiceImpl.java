package com.devstack.customerserviceapi.service.impl;
import com.devstack.customerserviceapi.entity.Customer;

import com.devstack.customerserviceapi.dto.CustomerDto;
import com.devstack.customerserviceapi.repo.CustomerRepo;
import com.devstack.customerserviceapi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerServiceImpl(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    @Override
    public void createCustomer(CustomerDto dto) {
        Customer customer = new Customer(
                dto.getId(), dto.getName(), dto.getAddress(), dto.getSalary()
        );

        customerRepo.save(customer);
    }
}
