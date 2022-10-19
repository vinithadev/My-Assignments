package week3day2assignment;

public class StudentsInfo {
	public void getStudentInfo(String name,int id) {
		System.out.println("Student Name:" +name);
		System.out.println("Student Id:" +id); 
	}
	
	
	public void getStudentInfo(String email,String no) {
		System.out.println("Mail Id:" +email);
		System.out.println("PhoneNumber:" +no);
	}
	

	public static void main(String[] args) {
		
		StudentsInfo call=new StudentsInfo();
		call.getStudentInfo("Vinitha", 0012);
		call.getStudentInfo("vinithatech89@gmail.com", "9698719789");
	}

}
