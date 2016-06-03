package com.ttb.service.geo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ttb.service.geo.impl.GeoServiceImpl;
import com.ttb.service.geo.entities.ZipCode;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

//@RefreshScope
@RestController
public class GeoController {
	@Autowired
	GeoServiceImpl geoService;

	@RequestMapping(value="/geo", method=RequestMethod.GET)
    @ApiOperation(value = "widget", nickname = "widget")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "postalCode", value = "postal code", required = false, dataType = "string", paramType = "query")
      })
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Success", response = ZipCode.class)})
	public List<ZipCode> widget(@RequestParam(value="postalCode") String postalCode) {
    	return geoService.findByPostalCode(postalCode);
    }
}
