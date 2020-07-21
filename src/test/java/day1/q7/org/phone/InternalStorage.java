package day1.q7.org.phone;

import day1.q7.org.phone.ExternalStorage;

public class InternalStorage {
	
	public void processorName(String processorName) {
			System.out.println("Processor Name is : "+processorName);
	}
	
	public void ramSize(int oneplusRamSize) {
			System.out.println("One Plus 6 Mobile Ram Size is : "+ oneplusRamSize  + "GB");
	}

	public static void main(String[] args) {
		InternalStorage inter = new InternalStorage();
		inter.processorName("Qualcomm Snapdragon 845");
		inter.ramSize(8);
		
		ExternalStorage ext = new ExternalStorage();
		ext.Screensize(6.2f);

	}

}
