package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private int rollno;
	private String name;
	
	public void display()
	{
		System.out.println("Student Class");	
	}
	//getters and setters
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//CONSTRUCTOR
	public Student() {
		super();
		System.out.println("Hello Everyone My Name Is DHANSHRI");
	}
	
	
	

}