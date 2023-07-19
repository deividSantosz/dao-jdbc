package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
	/*	System.out.println("\n=== TEST 1: department Insert ===");
		Department department = new Department(6, "Fashion");
		
		
	//	departmentDao.insert(department);
		System.out.println("Inserted completed! ");
	
		System.out.println("\n=== TEST 2: department Update ===");
		department.setName("Jerseys");
		departmentDao.update(department);
		System.out.println("Update completed! ");
	
		System.out.println("\n=== TEST 3: department FindById ===");
		DepartmentDao departmentDao = DaoFactory.createDeparmentDao();
		Department dep = departmentDao.findById(6);
		System.out.println(dep);
		System.out.println("Finish! ");
		
		System.out.println("\n=== TEST 4: department Delete ===");
		departmentDao.deleteById(5);
		System.out.println("Deleted! ");
	*/
		System.out.println("\n=== TEST 5: department FindAll ===");
		DepartmentDao departmentDao = DaoFactory.createDeparmentDao();
		List<Department> list = departmentDao.findAll();
		for (Department x : list) {
			System.out.println(x);
		}
	}

}
