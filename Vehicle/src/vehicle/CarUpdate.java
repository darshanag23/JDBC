package vehicle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CarUpdate {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle1", "root", "root");
			
			Statement st = con.createStatement();
			
//			st.executeUpdate("update car set color='Blue' where id='1'");
			st.executeUpdate("delete from car where id='2'");
			
			con.close(); 
			System.out.println("Deleted Successfully");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
				
	}

}
