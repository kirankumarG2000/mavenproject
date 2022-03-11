package com.cognizant.parmacymedicalsupply.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.parmacymedicalsupply.exception.InvalidTokenException;
import com.cognizant.parmacymedicalsupply.model.MedicineDemand;
import com.cognizant.parmacymedicalsupply.model.MedicineSupply;
import com.cognizant.parmacymedicalsupply.restclient.AuthClient;
import com.cognizant.parmacymedicalsupply.service.Services;


import feign.FeignException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/pharmasupply")
@Api(value="Pharmacy sypply", description="give the demand and get the pharmacy suppy details")
public class Controller {
	
	@Autowired
	private Services service;
	@Autowired
	AuthClient authClient;
	@PostMapping("/{medicineName}/{demandCount}")
	@ApiOperation(value="Get the demand of the medicine",notes="Supply to all the pharmacies is displayed",response=MedicineSupply.class)
	public ResponseEntity<List<MedicineSupply> >getSupply(@PathVariable("medicineName") String medicineName,@PathVariable("demandCount") int demandCount,
			@RequestHeader(name = "Authorization", required = true) String token) throws InvalidTokenException{
		log.info(token);
		try {
			if (!authClient.getsValidity(token).isValidStatus()) {
				throw new InvalidTokenException("Token is either expired or invalid...");
			}
		}
		catch(FeignException e) {
			throw new InvalidTokenException("Token is either expired or invalid...");
		}
		log.info("Controller Component");
		log.info("returns the supply data");
		try {
			return new ResponseEntity<>(service.getAllSupply(medicineName,demandCount,token),HttpStatus.OK); 
		} 
		catch (Exception e) {
			return new ResponseEntity<>(service.getAllSupply(medicineName,demandCount,token),HttpStatus.FORBIDDEN); 
		}
		
	}

}
