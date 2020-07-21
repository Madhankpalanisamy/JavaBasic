package day1.q9.org.allvehicle;

import day1.q9.org.threewheeler.ThreeWheeler;
import day1.q9.org.twowheeler.TwoWheller;
import day1.q9.org.fourwheeler.FourWheeler;

public class Vehicle {
	
	public void VehicleNecessery() {
		System.out.println("Vehicle Nessary for trasportation");
	}
	
	
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.VehicleNecessery();
		
		TwoWheller two = new TwoWheller();
		String bike = two.bike();
		System.out.println("My fav bike is : "+bike);
		System.out.println("My fav cycle brand is : "+two.cycle());
		
		ThreeWheeler three = new ThreeWheeler();
		String auto = three.Auto();
		System.out.println("i want to try riding : "+auto);
		
		FourWheeler four = new FourWheeler();
		System.out.println("My fav car is : "+four.car());
		String bus = four.bus();
		System.out.println("I would like to travel by : "+bus);
		String lorry = four.lorry();
		System.out.println("I would like to buy lorry-Truck type : "+lorry);
		
	}

}
