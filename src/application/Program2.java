package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		System.out.println("\n=== TEST 1: department Insert ===");
		Department department = new Department(6, "Fashion");
		DepartmentDao departmentDao = DaoFactory.createDeparmentDao();
		departmentDao.insert(department);
		System.out.println("Inserted completed! ");
		
		
	}

}
