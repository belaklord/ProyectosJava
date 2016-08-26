package conexionSql;
import java.sql.*;

import javax.swing.JOptionPane;

public class Conectar {
	
	Connection con = null;
	
	public Connection conexion(){
		
		try{
			
			// cargar el driver mysql //
			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/db_ejemplo", "root","");
			
			
		}catch (Exception e){
			
			JOptionPane.showMessageDialog(null, "error de conexion");
		}
		
		return con;
	}

}
