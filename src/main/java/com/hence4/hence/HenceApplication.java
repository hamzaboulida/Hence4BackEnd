package com.hence4.hence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.hence4.hence.property.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({
	FileStorageProperties.class
})
public class HenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HenceApplication.class, args);
	}

}
