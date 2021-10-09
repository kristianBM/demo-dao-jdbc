package application;

import java.sql.Connection;

import db.ConnectionFactory;

public class Program {

	public static void main(String[] args) {
		Connection conn = ConnectionFactory.getConnection();
		System.out.println("conectado!");
		
	}
}
