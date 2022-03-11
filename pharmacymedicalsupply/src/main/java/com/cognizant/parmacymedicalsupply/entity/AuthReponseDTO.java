package com.cognizant.parmacymedicalsupply.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuthReponseDTO {
	@JsonProperty
    private String username;
    @JsonProperty
    private String jwtAuthToken;
}