package com.hdfc.loans.personalloans;

/*public class DummyClass extends AbstractClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      DummyClass d=new DummyClass();
      d.method2();
      d.concrete();
      
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("We are implementing abstract method from abstract class");
	}

}*/

/* Implementing Abstract class AbsClass */
public class DummyClass extends AbsClass{
	
	public static void main(String[] args) {
		
		DummyClass d=new DummyClass();
		int a= d.pnb();
		System.out.println("Rate of interest for PNB is:"+a+"%");
		int b= d.Sbi();
		System.out.println("Rate of interest for SBI is:"+b+"%");
		
		}
	
}