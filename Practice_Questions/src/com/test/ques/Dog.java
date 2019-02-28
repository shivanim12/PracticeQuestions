package com.test.ques;

public class Dog implements Animals{
	
	String name;
	
	public Dog (String name) {
		this.name = name;
	}
	
	public void jump() {
		System.out.println(this.name + " jumped");
	}
	public void sound() {
		System.out.println(this.name +" says Bark");
	}


}
