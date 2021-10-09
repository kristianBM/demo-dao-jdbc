package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection getConnection() {

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/coursejdbc", "rot", "78052197");
			return conn;
		} catch (SQLException e) {
			e.getMessage();
			return null;
		}

	}

}
