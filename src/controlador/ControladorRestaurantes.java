package controlador;

import modelo.*;
import java.util.ArrayList;

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
	
	public ControladorRestaurantes(String ip, String puerto, String bdName, String user, String passw){
		this.model = new ModeloRestaurantes(ip, puerto, bdName, user, passw);
		this.tablaRestaurantes = model.getRestaurantes();
	}

	public ArrayList<Restaurante> getRestaurantes(){
		return this.tablaRestaurantes;
	}
	
	//public void recargarRestaurantes
}
