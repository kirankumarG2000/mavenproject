package com.cognizant.parmacymedicalsupply.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.parmacymedicalsupply.model.MedicineSupply;

@Repository
public interface MedicineSupplyRepository extends JpaRepository<MedicineSupply, String> {

}
