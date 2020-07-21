package day1.org.emp;

public class Employee {
	
	private long empBankAccount;
	private int empSalary;
	
	public Employee() {
		empBankAccount = 963258741231l;
		empSalary = 40000;
		System.out.println("Constructor Execution Started");
		System.out.println("Constructor job is to asign the values to the class variable");
		System.out.println("Employee Bank Account Number is : "+empBankAccount);
		System.out.println("Employee Salary is : "+ empSalary);
		System.out.println("Constructor Execution Ended");
	}
	
	public void empId() {
		int empId = 11379567;
		System.out.println("Employee id is : "+empId);
	}
	
	public void empName() {
		String empName = "Madhan Kuamr Palanisamy";
		System.out.println("Employee Name is : "+empName);
		}
	
	public void empDob() {
		String empDateOfBirth = "12/10/1993";
		System.out.println("Employee Date of Birth is : "+empDateOfBirth);
	}
	
	public void empPhone() {
		long empPhoneNumber = 8098951396l;
		System.out.println("Employee Phone Number is : "+empPhoneNumber);
		}
	
	public void empEmail() {
		String empEmail = "Madhankpalanisamy@gmail.com";
		System.out.println("Employee Email id is : "+empEmail);

	}
	
	public void empAddress() {
		String empAddress = "40/19 Thadikkaraswamy Koil Street, Alandur , Chennai-600016";
		System.out.println("Employee Address : "+empAddress);

	}
	
	public void empAge() {
		byte empAge = 26;
		System.out.println("Employee Age is : "+empAge);

	}
	

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.empId();emp.empName();emp.empAddress();emp.empPhone();emp.empEmail();emp.empDob();
		
		
	}

}
