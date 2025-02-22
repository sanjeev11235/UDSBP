package com.san.DevToolDemo.restController;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	//inject properties for: coach.name and team.name
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String teamName;
	
	// expose new endpoint for teamInfo
	@GetMapping("/teamInfo")
	public String getTeamInfo() {
		return "Coach: "+coachName +", Team Name: "+teamName;
	}
	// expose new endpoint for all
	@GetMapping("/")
	public String sayHello() {
		return "Hello World! Time on server is "+ LocalDateTime.now();
	}
	// expose new endpoint for workout
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run a hard  5K!";
	}
	// expose new endpoint for fortune
	@GetMapping("/fortune")
	public String getDailyFortune() {
		return "Today is your lucky day";
	}
}
