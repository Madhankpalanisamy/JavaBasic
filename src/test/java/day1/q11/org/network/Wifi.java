package day1.q11.org.network;

public class Wifi {
	
	public void wifiName() {
			String wifiName = "diconnect";
			System.out.println("Wifi Name is : "+wifiName);
	}


	public static void main(String[] args) {
		Wifi fi = new Wifi();
		fi.wifiName();
		
		MobileData mdata = new MobileData();
		mdata.dataName();
		
		Lan lan = new Lan();
		lan.lanName();
		
		Wireless wless = new Wireless();
		wless.modamName();
		

	}

}
