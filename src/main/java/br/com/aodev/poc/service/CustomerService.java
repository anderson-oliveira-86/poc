package br.com.aodev.poc.service;

import br.com.aodev.poc.entity.CustomerEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    private List<CustomerEntity> listCustomer = new ArrayList<>();

    public List<CustomerEntity> listCustomer(){
        return listCustomer;
    }

    public void addCustomer(CustomerEntity customer){
        listCustomer.add(customer);
    }
}
