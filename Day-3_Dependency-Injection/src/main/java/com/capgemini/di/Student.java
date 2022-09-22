package com.capgemini.di;

//dependancy in terms of literals
public class Student 
{
private String StudentName;
private int rollno;
/*//setters method
public void setStudentName(String studentName) {
	StudentName = studentName;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}*/

//DI using constructor

public Student(String studentName, int rollno) {
	super();
	StudentName = studentName;
	this.rollno = rollno;
}


public void display()
{
	System.out.println("StudentName is :"+StudentName+" "+"and Roll No is :"+rollno);
}

}