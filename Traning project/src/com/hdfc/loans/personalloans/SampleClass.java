package com.hdfc.loans.personalloans;

public class SampleClass implements SampleInterface{
	int a=10;
	
	public void add() {
		System.out.println("Please add the numbers");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Sir,How are you??");
		SampleClass obj= new SampleClass();
		obj.add();
		System.out.println(obj.a);
	   
		SampleClass abc= new SampleClass();
	    abc.add();
	    System.out.println(abc.a);
	    System.out.println("This is GITHUB server training class");
	    
	    abc.method1();
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Implemented method from the interface in the child class");
	}

}
