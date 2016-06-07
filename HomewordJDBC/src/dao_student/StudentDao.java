package dao_student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import jdbc.IDatabase;
import dto_student.Student;

public class StudentDao implements IDatabase{
	public static Connection connectionhandler() throws Exception{
		Class.forName("org.postgresql.Driver");
		String url="jdbc:postgresql://localhost:5432/dbstudent";
		String user="postgres";
		String password="123";
		return DriverManager.getConnection(url,user,password);
	}

	@Override
	public boolean insertRecord(Object obj) throws Exception {
		
		Student stu = (Student)obj;
		Connection con = null;
		PreparedStatement pst = null;
		
		try{
			con = connectionhandler();
			String sql="insert into tbstudent values(?,?,?,?,?)";
			pst = con.prepareStatement(sql);
			pst.setInt(1,stu.getId());
			pst.setString(2,stu.getName());
			pst.setString(3, stu.getGender());
			pst.setString(4,stu.getDob());
			pst.setFloat(5,stu.getScore());
			if(pst.executeUpdate()>0){
				return true;
			}
		}finally{
			if(con!=null){
				pst.close();
				con.close();
			}
		}
		return false;
		
	}

	@Override
	public boolean updateRecord(Object obj) throws Exception {
		
		Student stu = (Student)obj;
		Connection con = null;
		PreparedStatement pst = null;
		
		try{
			con = connectionhandler();
			String sql="update tbstudent set name=? , gender=? , dob=? , score=? where id="+stu.getDob()+"";
			pst = con.prepareStatement(sql);
			pst.setInt(1,stu.getId());
			pst.setString(2,stu.getName());
			pst.setString(3, stu.getGender());
			pst.setString(4,stu.getDob());
			pst.setFloat(5,stu.getScore());
			if(pst.executeUpdate()>0){
				return true;
			}
		}finally{
			if(con!=null){
				pst.close();
				con.close();
			}
		}
		return false;
		
	}

	@Override
	public boolean deleteRecord(int id) throws Exception {
		Connection con =null;
		PreparedStatement pst =null;
		try{
			con = connectionhandler();
			String query="delete tbstudent where id="+id+"";
			pst = con.prepareStatement(query);
			if(pst.executeUpdate()>0){
				return true;
			}
		}finally{
			pst.close();
			con.close();
		}
		return false;
	}

	@Override
	public ArrayList<Object> selectRecord() throws Exception {
		Connection con = null;
		Statement st =null;
		ResultSet rs = null;
		ArrayList<Object> stus = new ArrayList<>();
		try{
			con = connectionhandler();
			String query ="select *from tbstudent";
			st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rs = st.executeQuery(query);
			while(rs.next()){
				Student stu = new Student();
				stu.setId(rs.getInt("id"));
				stu.setName(rs.getString("name"));
				stu.setGender(rs.getString("gender"));
				stu.setScore(rs.getFloat("score"));
				stus.add(stu);
			}
			
		}finally{
			rs.close();
			st.close();
			con.close();
		}
		return stus;
	}

	@Override
	public ArrayList<Object> searchRecord(String search,String field) throws Exception {
		Connection con = null;
		Statement st =null;
		ResultSet rs = null;
		ArrayList<Object> stus = new ArrayList<>();
		try{
			con = connectionhandler();
			String query ="select *from tbstudent where "+field+" like '%"+search+"'%";
			st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rs = st.executeQuery(query);
			while(rs.next()){
				Student stu = new Student();
				stu.setId(rs.getInt("id"));
				stu.setName(rs.getString("name"));
				stu.setGender(rs.getString("gender"));
				stu.setScore(rs.getFloat("score"));
				stus.add(stu);
			}
			
		}finally{
			rs.close();
			st.close();
			con.close();
		}
		return stus;
	}
	
}
