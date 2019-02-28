package com.test.ques;

public class TestClass {
		
	public static void main(String[] args) {
		Dog d = new Dog("Moti");
		Cat c = new Cat("PhusPhus");
		Cat c1 = new Cat(null);
		Dog d1 = new Dog("Moti1");
		performActivity(c);
		performActivity(d);
		performActivity(c1);
		performActivity(d1);
	}

	public static void performActivity(Animals animal) {
		animal.sound();
		animal.jump();
	}
}
