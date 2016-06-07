package controler;

import java.util.Scanner;

import dao_student.StudentDao;
import inputinformation.InputInformation;
import viewer.Menu;

public class Controler {
	public static void myControler(){
		String menu =null;
		StudentDao data = new StudentDao();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		while(true){
			try{
				Menu.menu();
				menu = scan.nextLine().toLowerCase();
				switch(menu){
				case"1":
						data.insertRecord(InputInformation.studentInformation());
						System.out.println("Insert Data complete !");
					break;
				case"2":
						
					break;
				case"e":
					System.out.println("asdsad");
					System.exit(0);
					break;
				}
			}catch(Exception ex){
				System.out.println(ex.getMessage());
			}
			
		}
	}
}
