package jdbc;

import java.util.ArrayList;

public interface IDatabase {
	public abstract boolean insertRecord(Object obj) throws Exception;
	public abstract boolean updateRecord(Object obj) throws Exception;
	public abstract boolean deleteRecord(int id) throws Exception;
	public abstract ArrayList<Object> selectRecord() throws Exception;
	public abstract ArrayList<Object> searchRecord(String search,String field) throws Exception;
}
