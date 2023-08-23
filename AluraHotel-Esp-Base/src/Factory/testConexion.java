package Factory;

import java.sql.Connection;
import java.sql.SQLException;

public class testConexion {
	
	public static void main(String[] args) throws SQLException {
		ConexionBase conexion = new ConexionBase();
		Connection con = conexion.conectarBase();
		
		System.out.println("Probando conexion");
		
		con.close();
		System.out.println("cerrando conexion");
	}

}
