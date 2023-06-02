package com.data.mysqlspringboot.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderResponse {

    private String name;
    private String productName;

    public OrderResponse(String name,String productName){
        this.name=name;
        this.productName=productName;
    }

    private int price;
}
