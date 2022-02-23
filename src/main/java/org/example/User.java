package org.example;

//constructor
//setter
//field

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class User {

	@Autowired
	@Qualifier("cat2")
	private Animals dog;

	@Autowired
	@Qualifier("cat")
	private Animals cat;

//	public User() {
//	}
//
//	public User(Cat cat) {
//		this.cat = cat;
//	}
//
//	@Autowired
	public User(Cat cat, Dog dog) {
		this.cat = cat;
		this.dog = dog;
	}

	public void init(){
		System.out.println("user init");
	}

	public void destr(){
		System.out.println("user destroy");
	}

//	@Autowired
//	public void setCat(Cat cat) {
//		this.cat = cat;
//	}
//
//	@Autowired
//	public void setDog(Dog dog) {
//		this.dog = dog;
//	}

	@Override
	public String toString() {
		return "User{" +
				"cat=" + cat +
				", dog=" + dog +
				'}';
	}
}
