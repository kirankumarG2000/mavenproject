package com.cognizant.parmacymedicalsupply.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MedicineDemand {
	@Id
	private String medicine;
	@Column(name="demand_count")
	private int demandCount;
	

}
