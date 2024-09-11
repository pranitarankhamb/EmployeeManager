package org.techhub.EmpCrudApp.Service;
import java.util.*;
import org.techhub.EmpCrudApp.Model.DeptModel;

public interface DeptService {
	public boolean isAddDept(DeptModel model);
	public List<DeptModel>getAllDepts();

}
