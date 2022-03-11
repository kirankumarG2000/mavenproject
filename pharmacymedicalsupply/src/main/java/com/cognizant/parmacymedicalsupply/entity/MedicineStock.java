package com.cognizant.parmacymedicalsupply.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicineStock {
	private String name;
	private String composition;
	private String targetAilment;
	private String dateOfExpiry;
	private int noOfTablets;

}
