package day1.org.phone;

public class PhoneInfo {
		
	public void phoneName() {
		System.out.println("Phone Name is : One Plus 6");
	}
	
	public void phoneImeiNum() {
			System.out.println("Phone IMEI Numer is : 809895139688702");
	}
	
	public void Camera() {
			System.out.println("Front Camera : 16 MP");
			System.out.println("Rear Camera : 16 MP + 20 MP");
	}
	
	public void storage() {
			System.out.println("One plus 6 storage internal is : 128 GB");
			System.out.println("External storeage : will be supported upto 256 GB");
	}	
	
	public void osName() {
				System.out.println("One Plus 6 Os : Oxygen OS 10.3.4 with May patch");
	}
	
	public static void main(String[] args) {
		PhoneInfo pinfo = new PhoneInfo();
		pinfo.phoneName();pinfo.phoneImeiNum();pinfo.Camera();pinfo.storage();pinfo.osName();

	}

}
