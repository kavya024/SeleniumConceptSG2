package com.scientificgames.oops;

class Parent
{
	public void parentStyle()
	{
		System.out.println("parentStyle");
	}
	public void style()
	{
		System.out.println("father style");
	}
}

class Child1 extends Parent1
{
	
	public void childStyle()
	{
		System.out.println("parentStyle");
	}
	
}

public class InhertanceTest
{
	public static void main(String[] args) {

		Child c= new Child();
		c.parentStyle();
		c.childStyle();
	}
}







