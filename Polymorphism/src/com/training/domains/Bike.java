package com.training.domains;

import com.training.ifaces.Automobile;

public class Bike implements Automobile {

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 30000;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Wine Red";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Pulsar";
	}

}
