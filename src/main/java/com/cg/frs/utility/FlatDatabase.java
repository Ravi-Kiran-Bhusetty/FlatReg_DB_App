package com.cg.frs.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FlatDatabase {

	public Connection database() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/flat_reg", "root", "root");
		} catch (ClassNotFoundException e) {
		} catch (SQLException e) {
		}
		return connection;
	}
}
