package com.vmzone.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.vmzone.demo.models.FileStorageProperties;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@ComponentScan({"com.vmzone.demo"})
@EnableConfigurationProperties({
    FileStorageProperties.class
})
@EnableScheduling
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
