package cn.itcast.ssh.dao.impl;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import cn.itcast.ssh.dao.IEmployeeDao;
import cn.itcast.ssh.domain.Employee;

public class EmployeeDaoImpl extends HibernateDaoSupport implements IEmployeeDao {
	
	/**使用用户名作为查询条件，查询用户对象*/
	@Override
	public Employee findEmployeeByName(String name,String password) {
		String hql = "from Employee o where o.name = ? and o.password = ?";
		List<Employee> list = this.getHibernateTemplate().find(hql, name, password);
		Employee employee = null;
		if(list!=null && list.size()>0){
			employee = list.get(0);
		}
		return employee;
	}
	
	@Override
	public Employee findEmployeeByUserId(String userId, String password) {
		String hql = "from Employee o where o.userId = ? and o.password = ?";
		List<Employee> list = this.getHibernateTemplate().find(hql, userId, password);
		Employee employee = null;
		if(list!=null && list.size()>0){
			employee = list.get(0);
		}
		return employee;
		
	}
	
	@Override
	public void updaEmployee(Employee employee) {
		this.getHibernateTemplate().update(employee);
	}

	@Override
	public void saveEmployee(Employee employee) {
		this.getHibernateTemplate().save(employee);
	}

	@Override
	public void delEmployee(Employee employee) {
		this.getHibernateTemplate().delete(
				this.getHibernateTemplate().get(employee.getClass(),
						employee.getId()));

	}

	@Override
	public Employee getEmployeeById(Long id) {
		String hql = "from Employee o where o.id=?";
		List<Employee> list = this.getHibernateTemplate().find(hql, id);
		Employee employee = new Employee();
		if (list != null && list.size() > 0) {
			employee = list.get(0);
		}

		return employee;
	}

	@Override
	public List getEmployeeList() {
		String hql = "from Employee";
		List<Employee> list = this.getHibernateTemplate().find(hql);
		return list;
	}

	
}
