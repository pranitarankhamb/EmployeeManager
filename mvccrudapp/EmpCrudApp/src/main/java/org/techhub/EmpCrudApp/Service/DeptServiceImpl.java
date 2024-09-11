package org.techhub.EmpCrudApp.Service;
import org.springframework.stereotype.Service;
import org.techhub.EmpCrudApp.Model.DeptModel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.techhub.EmpCrudApp.Repository.DeptRepository;

@Service("deptService")
public class DeptServiceImpl implements DeptService {
    @Autowired
	DeptRepository deptRepo;
	@Override
	public boolean isAddDept(DeptModel model) {
	
		return deptRepo.isAddDept(model);
	}
	@Override
	public List<DeptModel> getAllDepts() {

		return deptRepo.getAllDepts();
	}
	

}
