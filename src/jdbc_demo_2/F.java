package jdbc_demo_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class F {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hvs_db_2", "root", "shreyas");
			Statement s = con.createStatement();
			s.executeUpdate("UPDATE detailes SET city = 'bang' WHERE email='sam@gmail.com'");
			
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
