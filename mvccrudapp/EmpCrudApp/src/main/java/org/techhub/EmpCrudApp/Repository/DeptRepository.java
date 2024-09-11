package org.techhub.EmpCrudApp.Repository;
import java.util.*;
import org.techhub.EmpCrudApp.Model.DeptModel;

public interface DeptRepository {
	 public boolean isAddDept(DeptModel model);
	 public List<DeptModel>getAllDepts();
   

}
