package br.com.sistema.cmd;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class UpdateManuscrito {

	public static void main(String[] args) {
		try {
			//abrir conexao com o banco de dados
			Connection conexao = ConnectionFactory.createConnection();
									
			//Importa a classe de transição de dados no sql
			Manuscrito manuscrito = new Manuscrito();
			
			//Envia o dados para a classe Manuscrito()
			manuscrito.setId(JOptionPane.showInputDialog("Entre com o id"));
			manuscrito.setTitulo(JOptionPane.showInputDialog("Entre com o Titulo do Manuscrito"));
			manuscrito.setAutor(JOptionPane.showInputDialog("Entre com o nome do Autor do Manuscrito"));
			
			String sql = "update manuscrito set titulo = ?, autor = ? where id = ?;";
			

			
			//Criando um comando para passar o SQL
			
			PreparedStatement cmd = conexao.prepareStatement(sql);
			cmd. setString(1, manuscrito.getTitulo());
			cmd. setString(2, manuscrito.getAutor());
			cmd. setString(3, manuscrito.getId());
			
			cmd.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Dado atualizado com sucesso!");
			
			cmd.close();
			
			} catch (Exception e) {
				e.printStackTrace();
		}

	}

}
