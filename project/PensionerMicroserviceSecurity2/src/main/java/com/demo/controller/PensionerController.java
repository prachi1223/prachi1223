package com.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.PensionerDetailMicroservice;
import com.demo.bean.PensionerLogin;
import com.demo.service.PensionerService;
import com.demo.springsecurityjwt.models.AuthenticationRequest;
import com.demo.springsecurityjwt.models.AuthenticationResponse;

@RestController
public class PensionerController {
@Autowired PensionerService pensionerservice;
	
	@GetMapping(value = "/authenticate")
	Optional<PensionerLogin> getpensionerDetailsByAaddhar(@RequestBody PensionerLogin pensioner,@PathVariable long aadharcardid){
	Optional<PensionerLogin>	pen= pensionerservice.getpensionerDetailsByAaddhar(pensioner, aadharcardid);
		return PensionerLogin;
	}
		@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
		public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {


			try {
				authenticationManager.authenticate(
						new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword())
				);
			}
			catch (BadCredentialsException e) {
				throw new Exception("Incorrect username or password", e);
			}


			final PensionerService PensionerDetail = PensionerDetail
					.loadUserByUsername(authenticationRequest.getUsername());

			final String jwt = jwtTokenUtil.generateToken(PensionerDetail);

			return ResponseEntity.ok(new AuthenticationResponse(jwt));
		}

	}



   