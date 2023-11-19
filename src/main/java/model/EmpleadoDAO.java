package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import config.Conexion;

public class EmpleadoDAO {
	Conexion conex = new Conexion();
	Connection con;
	PreparedStatement ps; 
	ResultSet rs;
	
	public Empleado validar(String user, String dni) {
		Empleado emp = new Empleado();
		String sql = "SELECT * FROM empleado WHERE user=? and dni=?";
		
		try {
			con = conex.Conexion();
			ps = con.prepareStatement(sql);
			ps.setString(1, user);
			ps.setString(2, dni);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				emp.setUser(rs.getString("User")); // La columna tiene de nombre: User
				emp.setDni(rs.getString("Dni"));
			}
			
		}catch(Exception e) {
			
		}
		return emp;
		
	}

}
