package com.youraf.mosaic.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.youraf.mosaic.dto.CustomerDTO;
import com.youraf.mosaic.model.Customer;

@Mapper(componentModel = "spring", uses = {})
public interface CustomerMapper {
	CustomerMapper INSTANCE = Mappers.getMapper( CustomerMapper.class ); 
	 
    CustomerDTO toDto(Customer customer);
}
