package vehicle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Car {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle1", "root", "root");

			Statement st = con.createStatement();

			st.execute("Insert into car values(3,'Benz', 'Silver', '1Cr')");
			con.close();
			System.out.println("Car data Saved");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
