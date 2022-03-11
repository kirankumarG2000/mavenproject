package com.cognizant.parmacymedicalsupply.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MedicineSupply {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="supply_id")
	private int supplyId;
	@Column(name="pharmacy_name")
	private String pharmaName;
	@Column(name="medicine_name")
	private String medicineName;
	@Column(name="count")
	private int supplyCount;

}
