package com.angularSpring.AngularSpringDemo.Users;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	List<UserModel> users = new ArrayList<>();
	
	@CrossOrigin("*")
	@RequestMapping("/users")
	public List<UserModel> getUsers() {
		
//		users.add(new UserModel("Niranjana", "Murthy"));
//		users.add(new UserModel("Shobha", "Acharya"));
//		users.add(new UserModel("Murthy", "Kumar"));
		return users;
	}
	
	@CrossOrigin("*")
	@RequestMapping( method = RequestMethod.POST , value="/user")
	public void addUser( @RequestBody UserModel user ) {
		users.add(user);
	}

}
