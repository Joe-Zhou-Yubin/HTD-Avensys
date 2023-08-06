package com.demo.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@RequestMapping("/customers")
	public List<Customer> retrieveCustomers(){
		return Arrays.asList(
				new Customer("Joe","MBS",999,100),
				new Customer("Moe","JBS",911,200),
				new Customer("Loe","LBS",555,300),
				new Customer("Koe","KBS",333,250)
				);
	}
}
