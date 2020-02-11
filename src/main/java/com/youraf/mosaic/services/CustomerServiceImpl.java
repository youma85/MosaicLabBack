package com.youraf.mosaic.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.youraf.mosaic.dto.CustomerDTO;
import com.youraf.mosaic.mapper.CustomerMapper;
import com.youraf.mosaic.repositories.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    private final CustomerMapper customerMapper;

    public CustomerServiceImpl(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    @Override
    public Page<CustomerDTO> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable)
            .map(customerMapper::toDto);
    }

	@Override
	public long countAll() {
		return customerRepository.countAll();
	}
}