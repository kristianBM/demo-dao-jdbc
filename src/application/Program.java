package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("=== Seller Base Test ===");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println();
		
		System.out.println("=== TEST 2: seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println();
		
		System.out.println("=== TEST 3: seller findAll===");
		List<Seller> findAll = sellerDao.findAll();
		for (Seller all : findAll) {
			System.out.println(all);
		}
		
		System.out.println();
		
		System.out.println("=== TEST 4: seller insert===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 5000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! Id: " + newSeller.getId());
		
		System.out.println(" ");
		
		System.out.println("=== TEST 5: seller update===");
		Seller updateSeller = sellerDao.findById(1);
		updateSeller.setName("Jackson Smith");
		updateSeller.setEmail("jackson@gmail.com");
		sellerDao.update(updateSeller);
		System.out.println("Updated! Current personal data: " + updateSeller);
		
		System.out.println(" ");
			
		System.out.println("=== TEST 6: seller delete===");
		System.out.print("Enter seller id to be deleted: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Seller deleted!");
		
		sc.close();
	}
}
