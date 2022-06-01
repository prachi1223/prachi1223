package com.demo;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class Client21Application {
	@Autowired
	private RestTemplate template;
	
	@Autowired
	private DiscoveryClient client;
	
	@GetMapping("/accessAPI")
	public String invokeClient1( ) {
		URI uri = client.getInstances("Client1").stream().map(si -> si.getUri()).findFirst()
				.map(s -> s.resolve("/client1")).get();
		return template.getForObject(uri, String.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(Client21Application.class, args);

	}
	@Bean
	public RestTemplate template() {
		return new RestTemplate();
   }
}

	