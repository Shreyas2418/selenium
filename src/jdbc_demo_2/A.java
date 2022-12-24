package jdbc_demo_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter your name");
		String name = scan.next();
		System.out.println("enter your city");
		String city = scan.next();
		System.out.println("enter your email");
		String email = scan.next();
		System.out.println("enter your mobile");
		String mobile = scan.next();
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hvs_db_1", "root", "shreyas");
			
			Statement state = con.createStatement();
			state.executeUpdate("insert into registration values('"+name+"','"+ city +"','"+email+"','"+mobile+"')");
			
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
