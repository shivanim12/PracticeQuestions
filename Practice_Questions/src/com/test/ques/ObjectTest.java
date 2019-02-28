package com.test.ques;

public class ObjectTest {
	
	private String name;
	public 	int size;
	
	public ObjectTest(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}
	
	public void setNameSize(int s, String n) {
		size=s;
		name=n;
	}
	public void getNameSize()
	{
		System.out.println("Name  "+name+"  Size  "+size);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
}

