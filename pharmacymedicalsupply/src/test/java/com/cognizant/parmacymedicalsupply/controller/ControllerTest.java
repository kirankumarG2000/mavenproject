package com.cognizant.parmacymedicalsupply.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.cognizant.parmacymedicalsupply.entity.ValidatingDTO;
import com.cognizant.parmacymedicalsupply.model.MedicineDemand;
import com.cognizant.parmacymedicalsupply.model.MedicineSupply;
import com.cognizant.parmacymedicalsupply.restclient.AuthClient;
import com.cognizant.parmacymedicalsupply.restclient.MedicineStockRestclient;

@AutoConfigureMockMvc
@SpringBootTest
class ControllerTest {
	
	@Autowired
	private Controller c;
	 @Mock
	 private AuthClient authClient;
	
	@Autowired
	private MockMvc mvc;
	@Autowired
    private ValidatingDTO  validatingDTO;
	
	@Autowired
	MedicineStockRestclient msr;

	@Test
	void test() {
		assertNotNull(c);
	}
	
	/*@Test
	public void getSupplyStatus() throws Exception {
		ResultActions actions = mvc.perform(post("/pharmasupply/dolo/20"));
		actions.andExpect(status().isBadRequest());
	}
	/*@Test
	void responseTest() {
		validatingDTO.setValidStatus(true);
    	when(authClient.getsValidity("token")).thenReturn(validatingDTO);
    	MedicineSupply sup = new MedicineDemand()
		
	}*/
	/*@Test
	public void status() {
		assertEquals("200 OK",c.getSupply("Dolo-650", 15, "token").getStatusCode().toString());
	}*/
	
	

}
