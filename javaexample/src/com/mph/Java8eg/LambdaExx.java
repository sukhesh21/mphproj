package com.mph.Java8eg;


/*interface Compute1{
	public void show();
	
}


public class LambdaExx 
{
	public static void main(String[] args) 
	{
		Compute1 com1=()->{System.out.println("good morning");};
		com1.show();
		//System.out.println(com1.show("good morning"));
	}
	
}
*/


interface Compute1{
public void show(String msg);

}


public class LambdaExx 
{
public static void main(String[] args) 
{
	Compute1 com1=(msg)->{System.out.println(msg);};
	com1.show("rcb");
	//System.out.println(com1.show("good morning"));
}

}
