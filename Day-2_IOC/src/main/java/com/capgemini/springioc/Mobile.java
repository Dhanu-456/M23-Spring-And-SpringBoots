package com.capgemini.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile
{

public static void main(String[] args)
{
	/*//obj creation for Airtel 
	Sim s=new Airtel();
	s.calling();
	s.Data();
	//obj creation for Jio 
		Sim s1=new Jio();
		s1.calling();
		s1.Data();*/
	
	ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
	System.out.println("Config....Loaded!");
	Airtel obj=(Airtel)a.getBean("airtel");
	obj.calling();
	obj.Data();
	Jio obj1=(Jio)a.getBean("jio");
	obj1.calling();
	obj1.Data();
	
	
	
}
}



