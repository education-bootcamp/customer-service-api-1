package com.devstack.customerserviceapi.service;

import com.devstack.customerserviceapi.dto.CustomerDto;

public interface CustomerService {
    public void createCustomer(CustomerDto dto);
    public CustomerDto findCustomerById(Long id);
}
