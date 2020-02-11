package com.youraf.mosaic.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.youraf.mosaic.dto.CustomerDTO;

public interface CustomerService {
    Page<CustomerDTO> findAll(Pageable pageable);
    
    long countAll();

}
