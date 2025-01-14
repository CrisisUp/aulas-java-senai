package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {
	public Connection conection;
	//private final String DRIVER = "com.mysql.jdbc.Driver";
	private final String DB_NAME = "locadora";
	private final String BD = "jdbc:mysql://localhost:3306?/" + DB_NAME;
	private final String USER = "root";
	private final String PASSWORD = "cris";
	
	public boolean getConnection() throws ClassNotFoundException {
		try {
			//Class.forName(DRIVER);
			conection = DriverManager.getConnection(BD, USER, PASSWORD);
			System.out.println("Coneção estabelecida com sucesso!");
			return true;
		} catch (SQLException e) {
			System.out.println("Problema na conexão com o Banco de Dados" + e.getMessage());
			return false;
		}
	}
	
	public void closeConnection() {
		try {
			conection.close();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		System.out.println("Usuario desconectado!");
	}
}
