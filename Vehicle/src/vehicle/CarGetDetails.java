package vehicle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CarGetDetails {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle1", "root", "root");
			
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("Select * from car");
			while (rs.next())
			{
				System.out.println("ID: "+rs.getInt(1));
				System.out.println("Brand: "+rs.getString(2));
				System.out.println("Color: "+rs.getString(3));
				System.out.println("Cost: "+rs.getString(4));
				System.out.println("-------------");
			}
			
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
			
		
		
	}

}
