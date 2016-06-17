package com.ttb.service.geo.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.ttb.service.geo.entities.ZipCode;

public interface ZipCodeRepository extends PagingAndSortingRepository<ZipCode, Long>{

	List<ZipCode> findByPostalCode(String postalCode);
}
