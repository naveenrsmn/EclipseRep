package com.training.domains;
import com.training.ifaces.Automobile;
 
public class Showroom {

	public Automobile getModel(int key)
	{
		switch(key)
		{
		case 1: return new MarutiCar();
		case 2: return new ToyotaCar();
		default: return null;
		}
	}
	
	public void printQuote(Automobile polyAuto)
	{
		System.out.println(Automobile.SHOWROOM_NAME);
		
		System.out.println(polyAuto.getModel());
		System.out.println(polyAuto.getColor());
		System.out.println(polyAuto.getPrice());
		
	}
	
	
}
