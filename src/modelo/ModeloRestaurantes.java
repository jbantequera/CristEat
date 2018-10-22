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

/**
 *
 * @author Javier
 */
public class ModeloRestaurantes extends ModeloAbstracto {
	
	private ArrayList<Restaurante> tablaRestaurantes = null;
	
	//Constructor por parámetros
	public ModeloRestaurantes(String ip, String port, String dbName, String user, String passw){
		//Llamamos al constructor del padre
		super(ip, port, dbName, user, passw);
		
		//Establecemos una conexión con un SGBD de MySQL
		this.conectarMySQL();
		
		//Importamos la tabla restaurantes
		this.importarRestaurantes();
	}
	
	//Método para mapear la tabla restaurantes de una base de datos
	private void importarRestaurantes(){
		//Preparamos un ArrayList vacío
		this.tablaRestaurantes = new ArrayList();
        Statement stmt = null;
		
		//Preparamos la consulta que vamos a realizar
        String consulta = "SELECT * FROM " + this.dbName + ".restaurantes";
        
        try{
            stmt = this.con.createStatement();
            ResultSet rs = stmt.executeQuery(consulta);
            
            while (rs.next()) { //Mientras existan tuplas
				int rId = rs.getInt("id");
				String rNombre = rs.getString("nombre");
                String rDirecc = rs.getString("direccion");
                String rCateg = rs.getString("categoria");
				
				//Mapeamos la tupla y añadimos un restaurante con esos datos al ArrayList
                this.tablaRestaurantes.add(new Restaurante(rId, rNombre, rDirecc, rCateg));
            }
        } catch (SQLException e){
            System.out.println("debug: Excepción SQL importando restaurantes");
        } finally {
            if (stmt != null){
                try {
					stmt.close(); //Cerramos la conexión
				} catch (SQLException ex) {
					System.out.println("debug: No se pudo cerrar la petición");
				}
			}
		}
	}

	//Método para devolver la tabla restaurantes
	public ArrayList<Restaurante> getRestaurantes(){
		if (this.tablaRestaurantes == null)
			this.importarRestaurantes();
		
		return (this.tablaRestaurantes);
	}
	
}
