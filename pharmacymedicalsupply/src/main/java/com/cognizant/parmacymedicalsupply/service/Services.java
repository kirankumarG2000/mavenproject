package com.cognizant.parmacymedicalsupply.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.parmacymedicalsupply.entity.MedicineStock;
import com.cognizant.parmacymedicalsupply.model.MedicineDemand;
import com.cognizant.parmacymedicalsupply.model.MedicineSupply;
import com.cognizant.parmacymedicalsupply.repository.MedicineDemandRepository;
import com.cognizant.parmacymedicalsupply.repository.MedicineSupplyRepository;
import com.cognizant.parmacymedicalsupply.restclient.MedicineStockRestclient;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class Services {
	
	@Autowired
	private MedicineDemandRepository mdr;
	
	@Autowired
	private MedicineSupplyRepository msr;
	
	@Autowired
	private MedicineStockRestclient mrc;
	
	public List<MedicineSupply> getAllSupply(String medicineName, int demandCount,String token){
		log.info("start");
		List<String> p = new ArrayList<String>();
		p.add("KK Medical");
		p.add("SM Medicals");
		p.add("RK Medicals");
		MedicineDemand md = new MedicineDemand();
		md.setMedicine(medicineName);
		md.setDemandCount(demandCount);
		log.info(medicineName);
		mdr.save(md);
		int stock = 0;
		List<MedicineStock> m = mrc.getAllStockDetails();
		/*MedicineStock m = new MedicineStock();
		m.setName("abd");
		m.setComposition("123");
		m.setDateOfExpiry("12345");
		m.setNoOfTablets(100);
		m.setTargetAilment("123456");*/
		
		for(MedicineStock a : m ) {
			if(a.getName().equals(md.getMedicine()))
				stock = a.getNoOfTablets();
		}
		/*if(m.getName().equals(md.getMedicine()))
			stock = m.getNoOfTablets();*/
		if(demandCount>0) {
		for(String ls :p) {
			MedicineSupply ms = new MedicineSupply();
			ms.setPharmaName(ls);
			ms.setMedicineName(md.getMedicine());
			if(stock>=p.size()*md.getDemandCount()) {
				ms.setSupplyCount(md.getDemandCount());
			}
			else {
				ms.setSupplyCount(stock/p.size());
			}
			/*if(stock>=p.size()*md.getDemandCount())
				stock=stock - p.size()*md.getDemandCount();
			else
				stock = 0;
			mrc.updateStockDetails(medicineName, stock);*/
			msr.save(ms);
		
		}
		}
		log.info("End");
		return msr.findAll();
		
	}


}
