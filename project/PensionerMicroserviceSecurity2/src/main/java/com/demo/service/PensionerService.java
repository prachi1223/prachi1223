package com.demo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.bean.PensionerLogin;
@Service

public interface PensionerService {
	
	//post
	PensionerLogin login(String username,String userpassword);

	Optional<PensionerLogin> getpensionerDetailsByAaddhar(PensionerLogin pensioner, long aadharcardid);

}
