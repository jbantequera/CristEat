/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Javier
 */
abstract public class ModeloAbstracto {
	
	protected Connection con = null;
	protected String ip = null;
	protected String port = null;
	protected String dbName = null;
	protected String user = null;
	protected String passw = null;
	
	//Constructor por parámetros
	public ModeloAbstracto(String ip, String port, String dbName, String user, String passw){
		this.ip = ip;
		this.port = port;
		this.dbName = dbName;
		this.user = user;
		this.passw = passw;
	}
	
	public void conectarMySQL() throws SQLException{
		this.con = DriverManager.getConnection("jdbc:mysql://" + ip + ":" + port+ "/" + dbName, user, passw);	
	}
	
}
