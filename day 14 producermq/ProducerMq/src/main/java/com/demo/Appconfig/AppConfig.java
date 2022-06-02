package com.demo.Appconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.demo")
@Import({MessagingConfig.class})
public class AppConfig {

}
