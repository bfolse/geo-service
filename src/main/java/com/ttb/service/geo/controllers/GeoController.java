package com.ttb.service.geo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ttb.service.geo.entities.ZipCode;
import com.ttb.service.geo.impl.GeoServiceImpl;

//@RefreshScope
@RestController
public class GeoController {
	@Autowired
	GeoServiceImpl geoServiceImpl;

	@RequestMapping(value="/geo", method=RequestMethod.GET)
	public List<ZipCode> geo(@RequestParam(value="postalCode") String postalCode) {
		System.out.println();
		System.out.println("geoServiceImpl: " + geoServiceImpl + " postalCode: " + postalCode);
		System.out.println();
    	return geoServiceImpl.findByPostalCode(postalCode);
    }
}
