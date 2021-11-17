package com.evoke.oopsConcepts;

public interface InterfaceEmployee {

	final int id = 20;
	final String name = "Srinidhi";
	 void display();
}
class Displaydetails implements InterfaceEmployee
{
public void display()
{

System.out.println("id:" +id);
System.out.println("Name:" +name);
}
}
