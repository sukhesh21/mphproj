package com.mph.Java8eg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class UserLambda {

	public static void main(String[] args) {
		User u1 = new User("suk","suk@gmail.com",23);
		User u2 = new User("muk","muk@gmail.com",22);
		User u3 = new User("pav","pav@gmail.com",21);
		
		List<User> li = new ArrayList<User>();
		li.add(u1);
		li.add(u2);
		li.add(u3);
		
		//System.out.println("List of Users : " +  li);
		
	/*	Iterator<User> i = li.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		*/
	
		li.forEach(lis ->System.out.println(lis));//using lambda expression consumer interface
		
	}

}