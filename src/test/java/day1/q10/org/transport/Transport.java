package day1.q10.org.transport;

import day1.q10.org.road.Road;
import day1.q10.org.air.Air;
import day1.q10.org.water.Water;

public class Transport {
	
	public void TransportForm() {
		System.out.println("Transport Form is Ready");
	}


	public static void main(String[] args) {
		Transport trans = new Transport();
		trans.TransportForm();
		
		Road road = new Road();
		road.bike();road.bus();road.car();road.cycle();
		
		Air air = new Air();
		air.aeroPlane();air.heliCopter();
		
		
		Water water = new Water();
		water.Boat();water.ship();
		
		

	}

}
