package com.training.domains;

import com.training.ifaces.Automobile;

public class newShowroom extends Showroom {

	@Override
	public Automobile getModel(int key) {
		// TODO Auto-generated method stub
		if (key==3)
		{
			return new Bike();
				}
		else 
		{
			return super.getModel(key);

		}
	}

}
