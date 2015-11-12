package cn.itcast.ssh.dao;

import java.util.List;
import cn.itcast.ssh.domain.Employee;

public interface IEmployeeDao {

	Employee findEmployeeByName(String name,String password);
	
	Employee findEmployeeByUserId(String userId,String password);

	public void updaEmployee(Employee employee);
	
	public void saveEmployee(Employee employee);
	
	public void delEmployee(Employee employee);
		
	public Employee getEmployeeById(Long id);
	
	public List getEmployeeList();

}
