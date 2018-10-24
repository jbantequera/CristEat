/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import modelo.*;

/**
 *
 * @author Javier
 */
public class ControladorUsuarios {
	
	private ModeloUsuarios model;
	private ArrayList<Usuario> tablaUsuarios;
	private JTextArea logger;
	
	public ControladorUsuarios(String ip, String puerto, String bdName, String user, String passw, JTextArea logger){
		this.logger = logger;
		
		try {
			this.model = new ModeloUsuarios(ip, puerto, bdName, user, passw);
		} catch (SQLException ex) {
			if (logger != null)
				logger.append("Excepción SQL al establecer una conexión \n");
			else
				System.out.println("Excepción SQL al establecer una conexión");
		}
		
		try {
			this.tablaUsuarios = model.getUsuarios();
		} catch (SQLException ex) {
			if (logger != null)
				logger.append("Excepción SQL al mapear los usuarios \n");
			else
				System.out.println("Excepción SQL al mapear los usuarios");
		}
	}
	
	public ArrayList<Usuario> getUsuarios(){
		try {
			this.tablaUsuarios = model.getUsuarios();
		} catch (SQLException ex) {
			if (logger != null)
				logger.append("Excepción SQL al devolver los usuarios desde el controlador \n");
			else
				System.out.println("Excepción SQL al devolver los usuarios desde el controlador");
		}
		return this.tablaUsuarios;
    }
	
	public void setLogger(JTextArea logger){
		this.logger = logger;
	}
	
	public void addUsuario(String id, String login, String passw){
		if ((!id.equals("")) && (!login.equals("")) && (!passw.equals(""))){
			try {
				Usuario nuevousuario = new Usuario(Integer.parseInt(id), login, passw);
			
				try {
					model.addUsuario(nuevousuario);
					logger.append("Usuario insertado con éxito");
				} catch (SQLException ex) {
					if (logger != null)
						logger.append("Excepción SQL al insertar un usuario en la base de datos \n");
					else
						System.out.println("Excepcion SQL al insertar un usuario en la base de datos");
				}
			} catch (NumberFormatException ex) {
				logger.append("No se ha podido crear el usuario.");
				JOptionPane.showMessageDialog(null, "Debes introducir un número en el campo ID.");
			}
		} else {
			JOptionPane.showMessageDialog(null, "No puedes dejar ningún campo vacío.");
			logger.append("No se ha podido crear el usuario. \n");
		}
	}
}
