/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Javier
 */
public class Restaurante {
	private int id;
	private String nombre;
	private String direccion;
	private String categoria;
	
	public Restaurante(){
		this.id = 0;
		this.nombre = null;
		this.direccion = null;
		this.categoria = null;
	}
	
	public Restaurante(int id, String nombre, String dir, String cat){
		this.id = id;
		this.nombre = nombre;
		this.direccion = dir;
		this.categoria = cat;
	}

	public void setId(int id){
		this.id = id;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}

	public String getCategoria() {
		return categoria;
	}
	
	
}
