package com.cognizant.parmacymedicalsupply.restclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import com.cognizant.parmacymedicalsupply.entity.MedicineStock;

@FeignClient(name="MEDSTOCK-SERVICE",url="localhost:8085")
public interface MedicineStockRestclient {
	
	@GetMapping("/stockdetails")
	public List<MedicineStock> getAllStockDetails();
	/*@PutMapping("/stockdetails/{mname}/{stock}")
	public void updateStockDetails(@PathVariable String mname, @PathVariable int stock);*/

}
