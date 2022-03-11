package com.cognizant.parmacymedicalsupply.service;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class ServicesTest {

	@Autowired
	private Services s;
	@Test
	void test() {
		assertNotNull(s);
	}
	
}
