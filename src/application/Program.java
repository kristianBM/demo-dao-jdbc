package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
	Department obj = new Department(1, "books");
			System.out.println(obj);
	
	Seller seller = new Seller(4858, "Marcos Claudio", "marcos.claudio@hotmail.com", new Date(), 2000.00, obj);
			System.out.println(seller);
	}
}
