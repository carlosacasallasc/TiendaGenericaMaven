package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion_BD {
	
	private static final String Conector = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/tienda_generica_grp_fullstack";
	private static final String Usuario = "root";
	private static final String PWD = "Desarrollo2020**";
	
	
	
	public Connection Conectar() {
		
		Connection conexion = null;
		
		try {
			Class.forName(Conector);
			DriverManager.getConnection(URL,Usuario,PWD);
			System.out.print("Conexión OK");
			
		} catch (ClassNotFoundException e) {
			System.out.print("Error al cargar el controlador");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.print("Error en la conexión");
			e.printStackTrace();
		}
		
		return conexion;
	}
		
	}

