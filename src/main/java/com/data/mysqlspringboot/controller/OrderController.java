package com.data.mysqlspringboot.controller;


import com.data.mysqlspringboot.domain.OrderRequest;
import com.data.mysqlspringboot.domain.OrderResponse;
import com.data.mysqlspringboot.entiry.Customer;
import com.data.mysqlspringboot.repository.CustomerRepository;
import com.data.mysqlspringboot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class OrderController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest orderRequest){
        return customerRepository.save(orderRequest.getCustomer());
    }

    @GetMapping("/findAllOrders")
    private List<Customer> findAllOrders(){
        return customerRepository.findAll();
    }

    @GetMapping("/getInfo")
    private List<OrderResponse> getJoinInformation(){
        return customerRepository.getJoinIformation();
//        return null;
    }
}
