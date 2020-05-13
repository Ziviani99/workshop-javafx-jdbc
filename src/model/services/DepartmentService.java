package model.services;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {
	
	private DepartmentDao dao = DaoFactory.createDepartmentDao();
	
	public List<Department> findAll(){
		//vai l� no banco de dados e busca os departamentos
		return dao.findAll();
	}
	
	public void saveOrUpdate(Department obj) {
		//caso o departamento ainda n�o exista no banco ele ir� inserir, caso contr�rio ir� atualizar
		if(obj.getId() == null) {
			dao.insert(obj);
		}
		else {
			dao.update(obj);
		}
	}
}
