package jdbc_demo_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class C {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hvs_db_1", "root", "shreyas");
			
			Statement state = con.createStatement();
			state.executeUpdate("UPDATE registration SET name = 'mike' WHERE email='sam@gmail.com'");
			
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
