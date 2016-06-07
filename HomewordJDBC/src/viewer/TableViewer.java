package viewer;
import java.util.ArrayList;
import dto_student.Student;

public class TableViewer {
	
	private TableViewer(){
		
	}
	
	/*-------------------------print header of table-------------------------*/
	public static void printHeader(){
		System.out.println();
		System.out.print("*");//"+"
		for(int i=0;i<Student.getFields().length;i++){
			for(int j=0;j<22;j++)
				System.out.print("=");
			if(i!=Student.getFields().length-1)
				System.out.print("*");
		}
		System.out.println("*");
		System.out.print("|");
		for(String s:Student.getFields()){
			System.out.printf("%-22s",s);
			System.out.print("|");
		}
		System.out.println();
		System.out.print("*");
		for(int i=0;i<Student.getFields().length;i++){
			for(int j=0;j<22;j++)
				System.out.print("=");
			if(i!=Student.getFields().length-1)
				System.out.print("*");
		}
		System.out.println("*");
	}
/*--------------------end of print header of table-------------------------*/

public static void printRecords(ArrayList<Student> stu) throws Exception{
	for(int i=0;i<stu.size();i++){
		System.out.print("|");
	for(int j=0;j<stu.get(i).getData().length;j++){
		System.out.printf("%-22s",stu.get(i).getData()[j]);
		if(j!=Student.getFields().length-1)
			System.out.print("|");
	}
	System.out.println("|");
		
	System.out.print("+");
	for(int k=0;k<Student.getFields().length;k++){
		for(int j=0;j<22;j++)
			System.out.print("-");
		if(k!=Student.getFields().length-1)
			System.out.print("+");
		}
		
		System.out.println("+");
	}	
}	
//-------------------------print footer of table-------------------------	
	/*public static void printFooter(ArrayList<Product> prdRecords, int currentPage, int totalPage){
		System.out.print("|");
		String margin="      ";
		String page="Page: "+(currentPage)+"/"+Pagination.getInstance().calculatePage();
		String totalRecord="Total Records: "+OperationControls.getInstanceObject().pros.size();
		int leftspace=22*(Product.getFields().length) - (margin.length()*2+page.length()+totalRecord.length())+Product.getFields().length-1;
		System.out.print(margin+page);
		for(int i=0;i<leftspace;i++)
			System.out.print(" ");
		System.out.print(totalRecord+margin);
		System.out.println("|");
		
		System.out.print("+");
		for(int i=0;i<Product.getFields().length;i++){
			for(int j=0;j<22;j++)
				System.out.print("=");
			if(i!=Product.getFields().length-1)
				System.out.print("=");
		}
		System.out.println("+");
	}*/
/*--------------------end of print footer of table-------------------------*/

}
