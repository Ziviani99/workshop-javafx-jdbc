package model.services;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {
	
	private DepartmentDao dao = DaoFactory.createDepartmentDao();
	
	public List<Department> findAll(){
		//vai lá no banco de dados e busca os departamentos
		return dao.findAll();
	}
	
	public void saveOrUpdate(Department obj) {
		//caso o departamento ainda não exista no banco ele irá inserir, caso contrário irá atualizar
		if(obj.getId() == null) {
			dao.insert(obj);
		}
		else {
			dao.update(obj);
		}
	}
}
