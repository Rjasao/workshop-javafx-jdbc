package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {
	
	private DepartmentDao dao = DaoFactory.createDepartmentDao();
	
	public List<Department> findAll(){
		// dados MOCKados
		//List<Department> list = new ArrayList<>();
		//list.add(new Department(1, "Book"));
		//list.add(new Department(2, "Computers"));
		//list.add(new Department(3, "Eletronics"));
		//return list;
		return dao.findAll();
		
	}

}
