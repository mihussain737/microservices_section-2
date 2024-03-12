package com.microservices.service;

import com.microservices.dto.CustomerDto;

public interface IAccountsService {
    /**
     *
     * @param customerDto-CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);
    CustomerDto fetchAccount(String mobileNumber);

    boolean updateAccount (CustomerDto customerDto);
}
