package Model.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Model.Bean.Student;

public class CheckLoginDAO {
	private static String DB_URL = "jdbc:postgresql://172.17.0.2:5432/course";
	private static String USER_NAME = "postgres";
	private static String PASSWORD = "12345678";
public boolean isExistUser(String username, String password) {
	try {
	Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);	
	Statement stm = conn.createStatement();
	ResultSet resultSet = stm.executeQuery("SELECT * FROM student");
	 while (resultSet.next()) {
            System.out.println(resultSet.getString("id"));
            if(username.equals(resultSet.getString("username")) && password.equals(resultSet.getString("password"))) {
            	return true;
            }
        }
	 conn.close();
	 return false;
} catch (Exception e) {
	System.out.println("err"+ e.getMessage());
	return false;
}
}


public ArrayList<Student> getArrList() {
	try {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);	
		Statement stm = conn.createStatement();
		ResultSet resultSet = stm.executeQuery("SELECT * FROM student");
		 while (resultSet.next()) {
			 Student student = new Student();
			 student.setUserName(resultSet.getString("username"));
			 student.setAddress(resultSet.getString("address"));
			 student.setGender(resultSet.getBoolean("gender"));
			 arrayList.add(student);
	       }
		 conn.close();
		 return arrayList;
	} catch (Exception e) {
		return null;
	}
}


public static Connection getConnection(String dbURL, String username, String password) {
Connection conn = null;
try {
//    Class.forName("com.mysql.cj.jdbc.Driver");
	 Class.forName("org.postgresql.Driver"); 
    conn = DriverManager.getConnection(dbURL, username, password);
    System.out.println("connect successfully!");
} catch (Exception ex) {
    System.out.println("connect failure!"+ ex.toString());
    ex.printStackTrace();
} 
return conn;
}

}
