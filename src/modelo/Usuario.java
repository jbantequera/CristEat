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
public class Usuario {
	private int id;
	private String login;
	private String passw;
	
	public Usuario(){
		this.id = 0;
		this.login = null;
		this.passw = null;
	}
	
	public Usuario(int id, String login, String passw){
		this.id = id;
		this.login = login;
		this.passw = passw;
	}

	public int getId() {
		return id;
	}

	public String getLogin() {
		return login;
	}

	public String getPassw() {
		return passw;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassw(String passw) {
		this.passw = passw;
	}
}
