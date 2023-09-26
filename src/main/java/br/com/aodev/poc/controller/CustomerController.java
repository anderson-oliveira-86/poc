package br.com.aodev.poc.controller;

import br.com.aodev.poc.entity.CustomerEntity;
import br.com.aodev.poc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping()
    public ResponseEntity<List<CustomerEntity>> getListCustomer(){
        return ResponseEntity.ok(service.listCustomer());
    }

    @PostMapping()
    public ResponseEntity.BodyBuilder addCustomer(@RequestBody CustomerEntity customer){
        service.addCustomer(customer);
        return ResponseEntity.status(HttpStatus.CREATED);
    }
}
