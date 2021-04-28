package com.mph.Java8eg;

interface Compute{
	public int add(int a,int b);
	
}
public class LambdaEg{

	public static void main(String[] args) {
		//below 2 lines are required while java 7 execution
		//LambdaEg le = new LambdaEg();
		//System.out.println(le.add(10, 20));
		
		Compute com=(a, b)->{ return (a+b);	};
		System.out.println(com.add(45, 40));// lambda expression always targets a functional interface
		
	}
	/*@Override
	public int add(int a, int b) {
		
		return (a+b);
	}*/
	
	
		
}