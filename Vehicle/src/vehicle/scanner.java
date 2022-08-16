package vehicle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class scanner {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter ID: ");
		int id = sc1.nextInt();
		
		System.out.println("Enter Name: ");
		String name = sc1.next();
		
		System.out.println("Enter Salary: ");
		double salary = sc1.nextDouble();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
		
		PreparedStatement ps = con.prepareStatement("Insert into emp values(?, ?, ?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setDouble(3, salary);
		
		ps.execute();
		System.out.println("Data saved");
		con.close();
		
		
	}

}
