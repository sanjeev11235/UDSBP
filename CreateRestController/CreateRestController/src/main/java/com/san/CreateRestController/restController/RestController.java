package com.san.CreateRestController.restController;

import java.time.LocalDateTime;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping("/")
	public String sayHello() {
		return "Hello World! Time on server is "+ LocalDateTime.now();
	}
}
