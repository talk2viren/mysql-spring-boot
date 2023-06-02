package com.data.mysqlspringboot;

import com.data.mysqlspringboot.entiry.Customer;
import com.data.mysqlspringboot.entiry.Product;
import com.data.mysqlspringboot.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
@Slf4j
public class MysqlSpringBootApplication implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(MysqlSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("String .. args");
		Product product1=new Product(1,"product-1",10,100);
		Product product2=new Product(2,"product-2",20,200);
		Product product3=new Product(3,"product-3",30,300);
		Product product4=new Product(4,"product-4",40,400);

		ArrayList<Product> arrayList=new ArrayList<>();
		arrayList.add(product1);
		arrayList.add(product2);
		arrayList.add(product3);
		arrayList.add(product4);

		Customer customer= new Customer(100,"customer-1","customer@email","male",arrayList);

//		productRepository.save(customer);


	}
}
