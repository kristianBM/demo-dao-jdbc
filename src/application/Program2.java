package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		System.out.println("=== Department Base Test ===");
		System.out.println(" ");
		
		System.out.println("=== TEST 1: department insert ===");
		Department newDepartment = new Department(null, "Furniture");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! Id: " + newDepartment.getId());
		
		System.out.println(" ");
		
		System.out.println("=== TEST 2: department update ===");
		Department dep2 = departmentDao.findById(3);
		dep2.setName("Food");
		departmentDao.update(dep2);
		System.out.println("Update completed");
		
		System.out.println(" ");
		
		System.out.println("=== TEST 3: department findById ===");
		Department dep = departmentDao.findById(2);
		System.out.println(dep);
		
		System.out.println(" ");
		
		System.out.println("=== TEST 4: department deleteById ===");
		System.out.print("Enter department id to be deleted: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Department deleted!");
		
		System.out.println(" ");
		
		System.out.println("=== TEST 5: department findAll ===");
		List <Department> findAll = departmentDao.findAll();
		for (Department all : findAll) {
			System.out.println(all);
		}
		sc.close();

	}

}
