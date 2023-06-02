package com.data.mysqlspringboot.repository;

import com.data.mysqlspringboot.domain.OrderResponse;
import com.data.mysqlspringboot.entiry.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    @Query("SELECT new com.data.mysqlspringboot.domain.OrderResponse(c.name, p.productName) from Customer c JOIN c.products p")
    public List<OrderResponse> getJoinIformation();
}
