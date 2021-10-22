package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	private static Connection conexion;

	public static void conectar() throws Exception {
//		com.mysql.jdbc.Driver
		Class.forName("com.mysql.jdbc.Driver");
//		jdbc:mysql://localhost:3306/inetum
		conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/inetum", "admin", "admin");
	}
	
	public static Connection getConexion() {
		return conexion;
	}
	
	public static void desconectar() throws SQLException {
		conexion.close();
	}
}
