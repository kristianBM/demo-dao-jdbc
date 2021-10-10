package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		System.out.println("=== Department Base Test ===");
		System.out.println(" ");
		
		System.out.println("=== TEST 1: department insert ===");
		Department newDepartment = new Department(null, "Furniture");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! Id: " + newDepartment.getId());
		
		System.out.println(" ");
		
		System.out.println("=== TEST 2: department update ===");
		Department updateDepartment = DepartmentDao.findById(1);
		updateDepartment.setName("Cars");
		DepartmentDao.update(updateDepartment);
		System.out.println("Updated! Current department data: " + updateDepartment);

	}

}
