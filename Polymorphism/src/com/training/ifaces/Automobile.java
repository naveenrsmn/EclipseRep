package com.training.ifaces;

// top level interface


public interface Automobile {
public static final String SHOWROOM_NAME="RAMESH CARS";
/*
 * All the methods in the interface or Implicitly Public and aBSTARCT
 *
 */
public  abstract double getPrice();
public String getColor();
// By default it is a public and abstract
public String getModel();

	
}
