package com.demo.bean;

import java.io.Serializable;

public class PensionerLoginResponse implements Serializable {
	 private final String jwt;

	    public  PensionerLoginResponse(String jwt) {
	        this.jwt = jwt;
	    }

	    public String getJwt() {
	        return jwt;
	    }
	}

