package com.youraf.mosaic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.youraf.mosaic.dto.CustomerDTO;
import com.youraf.mosaic.services.CustomerService;

@RestController
@CrossOrigin(origins = "*")
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	
	@GetMapping("/Customer")
	public Page<CustomerDTO> getCustomers(Pageable pageable){
		return service.findAll(pageable);
	}
	
	
	@GetMapping("/Customer/size")
	public long countAll(){
		return service.countAll();
	}
	
}
