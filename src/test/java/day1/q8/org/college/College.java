package day1.q8.org.college;

public class College {
	
	public void collegeName(String collegeName) {
		String nameOfTheCollege = collegeName;
			System.out.println("College Name is : "+nameOfTheCollege);
	}
	
	public void collegeCode(int collegeCode) {
		int codeOfTheCollege = collegeCode;
			System.out.println("College Code is : "+codeOfTheCollege);
	}
	
	public void collegeRank(int collegeRank) {
		int	rankOfTheCollege = collegeRank;
			System.out.println("College Rank is : "+rankOfTheCollege);
	}
	
	

	public static void main(String[] args) {
		College clg = new College();
		String clgName="Karpagam University";
		int clgCode =2710;
		byte clgRank = 100;
		clg.collegeName(clgName);
		clg.collegeCode(clgCode);
		clg.collegeRank(clgRank);
		
		Student student = new Student();
		String studentName = "Madhan Kumar Palanisamy";
		String studentDepartment = "Computer Science";
		String studentId = "11csu070";
		student.studentName(studentName);
		student.studentDept(studentDepartment);
		student.studentId(studentId);
		
		Hostel hostel = new Hostel();
		String hostelName = "Karpagam University Hostel";
		hostel.hostelName(hostelName);
		
		Dept dep = new Dept();
		String departmentName ="computerScience";
		dep.deptName(departmentName);
		

	}

}
