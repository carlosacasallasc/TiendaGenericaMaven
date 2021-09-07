package main;

import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion_BD {
	
		public static void main(String[] args) throws SQLException {
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda_generica_grp_fullstack","root","Desarrollo2020**");
				
				System.out.print("Conexión OK");
				
			} catch (Exception e) {
				System.out.print("Error al cargar el controlador");
				e.printStackTrace();
			}
		}
}
