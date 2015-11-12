package com.yx.sz.laboratory.workflow.service;

import java.util.List;
import cn.itcast.ssh.domain.Employee;

public interface IEmployeeService {

	Employee findEmployeeByName(String name,String password);
	
	public void updateEmployee(Employee employee);
	
	public void saveEmployee(Employee employee);
	
	public void delEmployee(Employee employee);
	
	public List getEmployeeByprocDefinitionId();
	
	public Employee getEmployeeById(Long id);

}
