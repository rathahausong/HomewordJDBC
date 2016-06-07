package dto_student;

public class Student {
	private int id;
	private String name;
	private String gender;
	private String dob;
	private float score;
	
	
	public static String FILED_ID ="ID";
	public static String FILED_NAME ="NAME";
	public static String FILED_GENDER="GENDER";
	public static String FILED_DOB="DOB";
	public static String FILED_SCORE="SCORE";
	
	public Student(){
		this.id = 1;
		this.name="sim rahta";
		this.gender="M";
		this.dob="30/07/1995";
		this.score=(float) 67.28;
	}
	
	public Student(int id , String name, String gender ,String dob,float score){
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}
	
	public static String[] getFields(){
		return new String[]{FILED_ID,FILED_NAME,FILED_GENDER,FILED_DOB,FILED_SCORE}; 
	}
	public String info(){
		return toString();
	}
	
	public String[] getData(){
		return new String[]{String.valueOf(this.id),this.name,this.gender,String.valueOf(this.score)};
	}
	@Override
	public final String toString(){
		return "["+this.id+"/"+this.name+"/"+this.gender+"/"+this.dob+"/"+this.score+"]";
	}
}
