package printfrom;




public final class PrintForm {
	
	public static PrintForm print = new PrintForm();
	private PrintForm(){
		return;
	}
	public static PrintForm getInstance(){
		if(print==null)
			return new PrintForm();
		return new PrintForm();
	}
	
	public boolean PrintExit(String message,String button){
		String buttontype = button;
		int btntpye = buttontype.length()+1;
		int space = message.length()+6;
		System.out.print("*");
		for(int i=0;i<message.length()+6-(btntpye);i++)
		System.out.print("=");
		System.out.print(buttontype+"=");
		System.out.println("*");
			
		System.out.print("|");
		System.out.printf("%-"+space+"s",message);
		System.out.println("|");
	/*	System.out.print("|");
		System.out.printf("%-"+space+"s",button);
		System.out.println("|");*/
		System.out.print("*");
		
		for(int i=0;i<message.length()+6;i++)
		System.out.print("=");
		System.out.print("*\n");
		
		String Bol="";
		return false;
			
	}
	
	public boolean PrintYesNo(String message,String button){
		String buttontype = button;
		int btntpye = buttontype.length()+1;
		int space = message.length()+6;
		System.out.print("*");
		for(int i=0;i<message.length()+6-(btntpye);i++)
		System.out.print("=");
		System.out.print(buttontype+"=");
		System.out.println("*");
			
		System.out.print("|");
		System.out.printf("%-"+space+"s",message);
		System.out.println("|");
	/*	System.out.print("|");
		System.out.printf("%-"+space+"s",button);
		System.out.println("|");*/
		System.out.print("*");
		
		for(int i=0;i<message.length()+6;i++)
		System.out.print("=");
		System.out.print("*\n");
		
		String Bol="";
			
			return false;
	}
	
	public void print(String message ,String type){
		
		int er = type.length()+1;
		int space = message.length()+6;
		System.out.print("*");
		for(int i=0;i<message.length()+6-(er);i++)
		System.out.print("=");
		System.out.print(type+"=");
		System.out.println("*");
		
		System.out.print("|");
		System.out.printf("%-"+space+"s",message);
		System.out.println("|");
		
		System.out.print("*");
		for(int i=0;i<message.length()+6;i++)
		System.out.print("=");
		System.out.print("*\n");
		
	}
}
