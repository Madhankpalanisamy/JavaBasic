package day1.org.company;

public class CompanyInfo {
	
	public void companyName() {
		System.out.println("Accenture Solutions Pvt ltd");
	}
	
	public void companyId() {
		System.out.println("Company Id is : Acc145GSU");
	}
	
	public void companyAddress() {
		System.out.println("Accenture Chennai office Address is : Shriram The Gateway, "
				+ "GST Road, New Perungalathur");
	}

	public static void main(String[] args) {
		CompanyInfo cinfo = new CompanyInfo();
		cinfo.companyName();cinfo.companyId();cinfo.companyAddress();
		
	}

}
