package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/Home")
	public String Home() {
		return "Home";
	}

	@GetMapping("/Learn")
	public String Learn() {
		return "Learn";
	}

	@GetMapping("/Build")
	public String Build() {
		return "Build";
	}

	@GetMapping("/Connect")
	public String Connect() {
		return "Connect";
	}

	@GetMapping("/Setting")
	public String Setting() {
		return "Setting";
	}

	@GetMapping("/BLEled")
	public String blel() {
		return "BLEled";
	}

	@GetMapping("/BLEchara")
	public String blec() {
		return "BLEchara";
	}

	@GetMapping("/BLEmotor")
	public String blem() {
		return "BLEmotor";
	}

	@GetMapping("/BLEradio")
	public String bler() {
		return "BLEradio";
	}

	@GetMapping("/Test")
	public String Test() {
		return "Test2";
	}

}
