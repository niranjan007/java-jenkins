package com.angularSpring.AngularSpringDemo.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.angularSpring.AngularSpringDemo.HomePage.Home;

@Service
public class HomeServices {

	List<Home> myList = new ArrayList<>();
	List<String> stringList = new ArrayList<>();
	
	public List<Home> getGome() {
		myList.add(new Home("hghghghg", "Niranjan shobha acharya"));
		myList.add(new Home("jijiji", "Niranjan  acharya"));
		myList.add(new Home("hihihi", "Niranjan shobha "));
		return myList;
	}
	
	public List<String> sendString(){
		stringList.add("NIranjan");
		stringList.add("MUrthy");
		stringList.add("SHobha");
		
		return stringList; 
	}
}
