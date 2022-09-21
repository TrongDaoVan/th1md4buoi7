package com.example.thuchanh1.service.customer;

import com.example.thuchanh1.model.Customer;
import com.example.thuchanh1.model.Province;
import com.example.thuchanh1.service.IGeneralService;

public interface ICustomerService extends IGeneralService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
}
