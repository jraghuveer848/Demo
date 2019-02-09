package com.novartis.locator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LatitudeLongitudeApplication {

	public static void main(String[] args) {
		SpringApplication.run(LatitudeLongitudeApplication.class, args);
	}

	@GetMapping("/{latitude}/{longitude}/{radius}")
	public void getDetails(@PathVariable double latitude,@PathVariable double longitude,@PathVariable double radius) {
		Test t=new Test();
		t.setLatitudeMinusFive(latitude-5);
		t.setLatitudePlusFive(latitude+5);
		t.setLongitudeMinusFive(longitude-5);
		t.setLongitudePlusFive(longitude+5);
		System.out.println(t.getLatitudeMinusFive());
		System.out.println(t.getLatitudePlusFive());
		System.out.println(t.getLongitudeMinusFive());
		System.out.println(t.getLongitudePlusFive());
	}
}

