package com.ttb.service.geo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import com.ttb.service.geo.entities.ZipCode;
import com.ttb.service.geo.repositories.ZipCodeRepository;

//@RefreshScope
@Service
public class GeoServiceImpl {
    @Autowired
    ZipCodeRepository zipCodeRepository;

	public List<ZipCode> findByPostalCode(String postalCode) {
		return zipCodeRepository.findByPostalCode(postalCode);
	}
}
