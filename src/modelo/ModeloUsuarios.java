/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public class ModeloUsuarios extends ModeloAbstracto{
		
	private ArrayList<Usuario> tablaUsuarios = null;
	
	//Constructor por parámetros
	public ModeloUsuarios(String ip, String port, String dbName, String user, String passw){
		//Llamamos al constructor del padre
		super(ip, port, dbName, user, passw);
		
		//Conectamos con nuestra base de datos
		this.conectarMySQL();
		
		//Importamos los usuarios
		this.refrescarUsuarios();
	}

	//Método para importar los usuarios de la base de datos a la que estemos conectados
	private void refrescarUsuarios(){
		//Preparamos un ArrayList vacío
		this.tablaUsuarios = new ArrayList();
        Statement stmt = null;
		
		//Consulta que vamos a realizar
        String consulta = "SELECT * FROM " + this.dbName + ".usuarios";
        
        try{
            stmt = this.con.createStatement();
            ResultSet rs = stmt.executeQuery(consulta);
            
            while (rs.next()) { //Mientras existan tuplas
                int rId = rs.getInt("id");
                String rLogin = rs.getString("login");
                String rPassw = rs.getString("passw");
				
				//Añadimos a la tabla de usuarios un nuevo usuario con los datos mapeados
                this.tablaUsuarios.add(new Usuario(rId, rLogin, rPassw));
            }
        } catch (SQLException e){
            System.out.println("Excepción SQL importando usuarios");
        } finally {
            if (stmt != null){
                try {
					stmt.close(); //Cerramos la petición
				} catch (SQLException ex) {
					System.out.println("No se pudo cerrar la petición");
				}
			}
		}
	}
	
	//Método para devolver los usuarios del sistema (A cualquier controlador)
	public ArrayList<Usuario> getUsuarios(){
		this.refrescarUsuarios();
		return (this.tablaUsuarios);
	}
	
	public void addUsuario(Usuario nuevousuario){
		Statement stmt = null;
		
		//Consulta que vamos a realizar
        String consulta = "insert into " + this.dbName + ".usuarios values(" + nuevousuario.getId()
				+ ", \"" + nuevousuario.getLogin() + "\",\"" + nuevousuario.getPassw() + "\")";
        
        try{
            stmt = this.con.createStatement();
            stmt.executeUpdate(consulta);
			
			this.refrescarUsuarios();
        } catch (SQLException e){
			JOptionPane.showMessageDialog(null, "Error al crear el usuario");
            System.out.println("Excepción SQL añadiendo usuarios");
        } finally {
            if (stmt != null){
                try {
					stmt.close(); //Cerramos la petición
				} catch (SQLException ex) {
					System.out.println("No se pudo cerrar la petición");
				}
			}
		}
	}
	
	
}
