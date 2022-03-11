package com.cognizant.parmacymedicalsupply.entity;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.*;

@Getter
@Setter
@Component
public class ValidatingDTO {
	   
	    @JsonProperty
	    private boolean validStatus;
	    
	}


