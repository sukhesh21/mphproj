package com.mph.view;

import java.io.BufferedReader;
import java.util.function.BiPredicate;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;

import com.mph.controller.EmployeeController;
import com.mph.controller.EmployeeInterface;
import com.mph.exception.EmployeeNotFoundException;

public class MainClass {
	
	public static void main(String[] args) throws IOException 
	{ 
		
		Scanner sc = new Scanner(System.in);
       	List  elist=null;
	    String input = null;
	    EmployeeInterface ec= new EmployeeController();
		
	    EmployeeNotFoundException us=new EmployeeNotFoundException();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String un,pw;
		System.out.println("Enter UserName");
		un=br.readLine();
		System.out.println("Enter password");
		pw=br.readLine();
//	if(un.equals("sukh")&& pw.equals("sukh"))
		
		BiPredicate<String,String> b1=(un1,pw1)->un1.equals("s")&& pw1.equals("s");
		if(b1.test(un,pw))
		{
		try{
			
			System.out.println("loading");
			Thread.sleep(1000);
		
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
			do
		{
			System.out.println("Enter your Choice");
			System.out.println("1. Add Employee");
			System.out.println("2. View Employee");
			System.out.println("3. sort Employee");
			System.out.println("4. sort with name");
			System.out.println("5.serialization");
			System.out.println("6.Deserializarion");
			System.out.println("7.Procedure Insert");
			System.out.println("8.Get ResultSet MetaData Information ");
			System.out.println("9. RS Forward Only");
			System.out.println("10. RS scroll insensitive");
			System.out.println("11. RS scroll sensitive");
			System.out.println("12. batch update");
			int choice = sc.nextInt();
			switch (choice)
			{
			case 1: 
			{
				elist= ec.addEmployee();
				break;
			}

			case 2: {
				ec.viewEmployee(elist);
				break;
			}
			case 3: {
				ec.sortEmployee();
				break;
			}
			case 4: {
                ec.nameStart();
                break;
			}
			case 5: {
                ec.Serial();
                break;
			}
			case 6: {
                ec.Deserial();
                break;
			}
			case 7: {
				ec.insertUsingProc();
			}
			case 8: {
				ec.rsmd();
			}
			case 9: {
				ec.type_forward_only_rs();
			}
			case 10: {
				ec.type_scroll_insensitive_rs();
			}
			case 11: {
				ec.type_scroll_sensitive_rs_insert();
			}
			case 12: {
				ec.batchUpdate();
			}
			default: {
                
			}
			}
			System.out.println("Do you want to continue ? Y or y for yes");
		  input = sc.next();
		} while (input.equals("Y") || input.equals("y"));
		System.out.println("System Exited..Thanks for using our system !!!");
		System.exit(0);
		}
		
		else
		{
			us.UserNotFoundException();
		}
}
}









		