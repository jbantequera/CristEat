package controlador;

import java.sql.SQLException;
import modelo.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javier
 */
public class ControladorRestaurantes {
	
	private ModeloRestaurantes model;
	private ArrayList<Restaurante> tablaRestaurantes;
	private JTextArea logger;
	
	public ControladorRestaurantes(String ip, String puerto, String bdName, String user, String passw, JTextArea logger){
		this.logger = logger;
		
		try {
			this.model = new ModeloRestaurantes(ip, puerto, bdName, user, passw);
		} catch (SQLException ex) {
			if (logger != null)
				logger.append("Excepción SQL al crear un modelo de restaurantes. \n");
			else
				System.out.println("Excepción SQL al crear un modelo de resturantes.");
		}
		
		try {
			this.tablaRestaurantes = model.getRestaurantes();
		} catch (SQLException ex) {
			if (logger != null)
				logger.append("Excepción SQL al mapear la tabla de restaurantes. \n");
			else
				System.out.println("Excepción SQL al mapear la tabla de restaurantes.");
		}
		
	}

	public ArrayList<Restaurante> getRestaurantes(){
		try {
			this.tablaRestaurantes = model.getRestaurantes(); //Refrescamos la tabla
		} catch (SQLException ex) {
			if (logger != null)
				logger.append("Excepción SQL al crear un modelo de restaurantes. \n");
			else
				System.out.println("Excepción SQL al crear un modelo de resturantes.");
		}
		
		return this.tablaRestaurantes;
	}
	
	public void setLogger(JTextArea logger) {
		this.logger = logger;
	}
	
	public void addRestaurante(String id, String nombre, String direccion, String categoria){
		if ((!id.equals("")) && (!nombre.equals("")) && (!direccion.equals("")) & (!categoria.equals(""))){
			try{
				Restaurante nuevorestaurante = new Restaurante(Integer.parseInt(id), nombre, direccion, categoria);

				try {
					model.addRestaurante(nuevorestaurante);
					logger.append("Restaurante insertado con éxito. \n");
				} catch (SQLException ex) {
					if (logger != null)
						logger.append("Excepción SQL al insertar un restaurante en la base de datos. \n");
					else
						System.out.println("Excepción SQL al insertar un restaurante en la base de datos.");	
				}
			} catch (NumberFormatException ex) {
				logger.append("No se ha podido crear el restaurante.");
				JOptionPane.showMessageDialog(null, "Debes introducir un número en el campo ID.");
			}
		} else {
			JOptionPane.showMessageDialog(null, "No puedes dejar ningún campo vacío.");
			logger.append("No se ha podido crear el usuario.");
		}
	}
}
