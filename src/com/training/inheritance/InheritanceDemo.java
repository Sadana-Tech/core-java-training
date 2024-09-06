package com.training.inheritance;

public class InheritanceDemo {
	
	public static void main(String[] args) {
	    Car car = new Car();
	    car.engine(); // Inherited from Vehicle
	    car.autoModeDrive(); // Specific to Car
	    
	    Bus bus = new Bus();
	    bus.vehicle.brake();
	    bus.vehicle2.brake();
	  }

}
