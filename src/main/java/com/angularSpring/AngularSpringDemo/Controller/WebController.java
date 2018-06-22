package com.angularSpring.AngularSpringDemo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angularSpring.AngularSpringDemo.HomePage.Home;
import com.angularSpring.AngularSpringDemo.Services.HomeServices;

@RestController
public class WebController {
	
	
	
	@Autowired
	private HomeServices homeServices;
	

	@RequestMapping("/home")
	public List<Home> sayHello() {
		return homeServices.getGome();
	}
	
	@RequestMapping("/hi")
	public List<String> sayHi() {
		return homeServices.sendString();
	}
}
