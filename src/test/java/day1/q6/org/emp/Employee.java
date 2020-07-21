package day1.q6.org.emp;

import day1.q6.org.company.Company;
import day1.q6.org.client.Client;
import day1.q6.org.project.Project;

public class Employee {
	
	public void empName() {
		String empName = "Madhan Kumar Palanisamy";
		System.out.println("Employee Name is : "+empName);
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.empName();
		
		//Company Class Object
		Company com = new Company();
		com.companyName();
		
		//Client
		Client clt = new Client();
		clt.clientName();
		
		//Project
		Project pro = new Project();
		pro.projectName();
		
	}

}
