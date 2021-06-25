package com.cg.springbootdemo.springbootdemo;



public class Counter {
	static int a=10;
	public void increment()
	{
		for(int i=0;i<3;i++)
		{
			++a;
		}
	}
	public void decrement()
	{
		System.out.println("Decrement");
		--a;
	}
	public void display()
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		System.out.println("Welcome to SpringBoot");
		Counter s1 = new Counter();
		
		s1.increment();
		s1.display();
		s1.decrement();
		s1.display();
		
	}

}
