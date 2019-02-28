package com.test.ques;

public class Cat implements Animals {

	String name;
	
	public Cat (String name) {
		this.name = name;
	}
	public void jump() {
		if (this.name == null) {
			System.out.println("Error : Cat name is null");
			return;
		}
		System.out.println(this.name+" jumped");
	}
	public void sound() {
		if (this.name == null) {
			System.out.println("Error : Cat name is null");
			return;
		}
		System.out.println(this.name+" says Meow");
	}
	


}
