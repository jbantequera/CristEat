/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.*;

/**
 *
 * @author Javier
 */
public class ControladorUsuarios {
	
	private ModeloUsuarios model;
	
	public ControladorUsuarios(String ip, String puerto, String bdName, String user, String passw){
		this.model = new ModeloUsuarios(ip, puerto, bdName, user, passw);
	}
	
	public ArrayList<Usuario> getUsuarios(){
		return model.getUsuarios();
    }
	
	public void addUsuario(String id, String login, String passw){
		Usuario nuevousuario = new Usuario(Integer.parseInt(id), login, passw);
		model.addUsuario(nuevousuario);
	}
}
