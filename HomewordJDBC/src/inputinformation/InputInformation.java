package inputinformation;

import java.util.Scanner;

import dto_student.Student;

public class InputInformation {
	
	public  static Student studentInformation(){
		Student student = new Student();
		Scanner scan = new Scanner(System.in);
		boolean bool = false;
		do{
			try{
				System.out.print("ID     : ");
				student.setId(Integer.parseInt(scan.nextLine()));
				System.out.print("Name   : ");
				student.setName(scan.nextLine());
				System.out.print("Gender : ");
				student.setGender(scan.nextLine());
				System.out.print("DOB    :");
				student.setDob(scan.nextLine());
				System.out.print("Score  :");
				student.setScore(Float.parseFloat(scan.nextLine()));
				
			}catch(Exception ex){
				///////
			}
			
		}while(bool);
		return student;
	}
}
