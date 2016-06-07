package controler;

import java.util.Scanner;

import viewer.Menu;

public class Controler {
	public static void myControler(){
		String menu =null;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		while(true){
			try{
				Menu.menu();
				menu = scan.nextLine().toLowerCase();
			}catch(Exception ex){
				
			}
			switch(menu){
			case"e":
				System.out.println("asdsad");
				System.exit(0);
				break;
			}
		}
	}
}
