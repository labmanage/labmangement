package com.yx.sz.laboratory.workflow.service.impl;

import java.util.List;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Employee;
import cn.itcast.ssh.service.IEmployeeService;

public class EmployeeServiceImpl implements IEmployeeService {

	private IEmployeeDao employeeDao;

	public void setEmployeeDao(IEmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	/**使用用户名作为查询条件，查询用户对象*/
	@Override
	public Employee findEmployeeByName(String name,String password) {
		Employee employee = employeeDao.findEmployeeByName(name,password);
		return employee;
	}
	
	@Override
	public void updateEmployee(Employee employee) {
		this.employeeDao.updaEmployee(employee);
	}

	@Override
	public void saveEmployee(Employee employee) {
		this.employeeDao.saveEmployee(employee);
	}

	@Override
	public void delEmployee(Employee employee) {
		this.employeeDao.delEmployee(employee);
	}

	@Override
	public List getEmployeeByprocDefinitionId() {
		List list = this.employeeDao.getEmployeeList();
		return list;
	}

	@Override
	public Employee getEmployeeById(Long id) {
		Employee employee = this.employeeDao.getEmployeeById(id);
		return employee;
	}

	@Override
	public Employee findEmployeeByUserId(String userId, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> list() {
		return employeeDao.getEmployeeList();
	}
	
}
