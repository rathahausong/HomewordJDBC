package viewer;

import java.util.ArrayList;

public class Viewer {
	public static Viewer viewer = new Viewer();
	public static Viewer getInstanceObject(){
		if(viewer!=null)
			return viewer;
		return new Viewer();
	}
	private Viewer(){
		return;
	}
	
	public void display(ArrayList<Object> obj){
		
		
	}
	
}
