package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentDaoJDBC implements DepartmentDao {

	private Connection conn;
	
	public DepartmentDaoJDBC (Connection conn) {
		this.conn = conn;
	}
	@Override
	public void insert(Department obj) {
		PreparedStatement st = null; 
		try {
			st = conn.prepareStatement(
					"INSERT INTO department "
					+"(Id, Name)"
					+"VALUES "
					+"(?, ?) ");
			
			st.setInt(1, obj.getId());
			st.setString(2, obj.getName());
			
			int arrows = st.executeUpdate();
			if(arrows == 0) {
				System.out.println("Nao foi possivel fazer a inserção");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		
		} finally {
			DB.closeStatement(st);
		}
	}

	@Override
	public void update(Department obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Department findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
