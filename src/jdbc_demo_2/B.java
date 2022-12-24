package jdbc_demo_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class B {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hvs_db_1", "root", "shreyas");
			
			Statement state = con.createStatement();
			state.executeUpdate("DELETE FROM registration WHERE email='jhon@gmail.com'");
			
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
