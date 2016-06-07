package application;

import controler.Controler;

public class Main {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		try{
			new Controler().myControler();
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}

}
