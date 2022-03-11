package com.cognizant.parmacymedicalsupply.restclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.cognizant.parmacymedicalsupply.entity.ValidatingDTO;




@FeignClient(name = "AUTH-CLIENT", url = "http://localhost:8085/authorization")
public interface AuthClient {
	
	 @GetMapping(value = "/validate")
     public ValidatingDTO getsValidity(@RequestHeader(name = "Authorization", required = true) String token);

//	 @PostMapping(value = "/login")
//     public AuthReponseDTO userLogin(@RequestBody LoginModel usermodel);

}
