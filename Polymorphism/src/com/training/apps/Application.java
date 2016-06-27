package com.training.apps;
 
import java.util.*;

import com.training.domains.newShowroom;
import com.training.ifaces.Automobile;
public class Application
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		String ch = "Y";
		int key;
		do
		{
		System.out.println("Enter 1 for maruti ;2 for Toyota;3 for Bike");
		key=sc.nextInt();
		
		newShowroom obj = new newShowroom();
		Automobile polyAuto = obj.getModel(key);
		
		if (polyAuto==null)
		{
			System.out.println("Invalid Choice");
		}
		else
		{
		obj.printQuote(polyAuto);
		}
		System.out.println("Y to continue and N to Exit");
		ch= sc.next();
		
		}while(ch.equalsIgnoreCase("Y"));
		sc.close();
		}
		
}
