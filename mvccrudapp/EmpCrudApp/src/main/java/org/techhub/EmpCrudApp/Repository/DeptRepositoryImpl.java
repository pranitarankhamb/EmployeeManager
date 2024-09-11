package org.techhub.EmpCrudApp.Repository;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.techhub.EmpCrudApp.Model.DeptModel;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;

@Repository("deptRepo")
public class DeptRepositoryImpl implements DeptRepository {
	@Autowired
	JdbcTemplate template;
	List<DeptModel>deptList;
	@Override
	public boolean isAddDept(final DeptModel model) {
		 int value=template.update("insert into dept values('0',?)",new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				 ps.setString(1,model.getName());
			}
			 
		 });
		return value>0?true:false;
	}
	@Override
	public List<DeptModel> getAllDepts() {
		deptList=template.query("select *from dept",new RowMapper<DeptModel>() {

			@Override
			public DeptModel mapRow(ResultSet rs, int rowNum) throws SQLException {
				DeptModel deptModel=new DeptModel();
				deptModel.setId(rs.getInt(1));
				deptModel.setName(rs.getString(2));
				return deptModel;
			}
			
		});
		return deptList.size()>0?deptList:null;
	}


}
