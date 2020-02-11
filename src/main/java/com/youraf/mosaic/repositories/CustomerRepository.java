package com.youraf.mosaic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sun.xml.bind.v2.model.core.ID;
import com.youraf.mosaic.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, ID>{

	@Query("select count(c) from Customer c")
	long countAll();

	
}
