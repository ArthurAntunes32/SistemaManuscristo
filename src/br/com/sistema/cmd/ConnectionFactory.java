package br.com.sistema.cmd;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class ConnectionFactory {
	public static Connection createConnection() {	
	String stringDeConexao = "jdbc:mysql://localhost:3306/manuscritos";
	String usuario = "root";
	String senha = "";
	Connection conexao = null;
	
	try {
		conexao = DriverManager.getConnection(stringDeConexao, usuario, senha);	
	}catch(Exception e) {
		e.printStackTrace(); 
	}
	return conexao;
	}
}
