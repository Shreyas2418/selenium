package jdbc_demo_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class E {
	public static void main(String[] args) {
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hvs_db_2", "root", "shreyas");
			Statement s = con.createStatement();
			s.executeUpdate("insert into detailes values('am','dehhi','am@gmail.com','47586289')");
			
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
