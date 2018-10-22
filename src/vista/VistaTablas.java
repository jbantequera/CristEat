/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.Usuario;
import modelo.Restaurante;
import controlador.*;
import java.util.ArrayList;

/**
 *
 * @author Javier
 */
public class VistaTablas {
	
	ControladorRestaurantes contRestaurantes;
	ControladorUsuarios contUsuarios;
	
	public VistaTablas(){
		this.contRestaurantes = null;
		this.contUsuarios = null;
	}
	
	//Método que muestra los usuarios por pantalla
	public void verUsuarios(){
		ArrayList<Usuario> usuarios = this.contUsuarios.getUsuarios();
		
		System.out.println("\t----- USUARIOS -----");
		System.out.println("ID" + "\tLogin" + "\t\tPassword");
		for (int i = 0; i < usuarios.size(); i++){
			System.out.print(usuarios.get(i).getId() + "\t");
			System.out.print(usuarios.get(i).getLogin() + "\t");
			System.out.println(usuarios.get(i).getPassw());
		}
		
	}
	
	//Método que muestra los restaurantes por pantalla
	public void verRestaurantes(){
		ArrayList<Restaurante> restaurantes = this.contRestaurantes.getRestaurantes();
		
		System.out.println("\t----- RESTAURANTES -----");
		System.out.println("ID" + "\tNombre" + "\t\tDireccion" + "\t\tCategoria");
		
		for (int i = 0; i < restaurantes.size(); i++){
			System.out.print(restaurantes.get(i).getId() + "\t");
			System.out.print(restaurantes.get(i).getNombre() + "\t");
			System.out.print(restaurantes.get(i).getDireccion() + "\t");
			System.out.println(restaurantes.get(i).getCategoria());
		}
	}
	
}
