package com.yx.sz.laboratory.workflow.action;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cn.itcast.ssh.domain.Employee;
import cn.itcast.ssh.service.IEmployeeService;
import cn.itcast.ssh.utils.SessionContext;
import cn.itcast.ssh.utils.ValueContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport implements ModelDriven<Employee> {
	
	private HttpServletRequest request = null;

	private HttpServletResponse response = null;

	private Employee employee = new Employee();

	// 信息提示
	private String alertString = "";
	
	List list = new ArrayList();
	
	private IEmployeeService employeeService;

	/**
	 * 登录
	 * @return
	 */
	public String login(){
		//1：获取用户名
		String userId = employee.getUserId();
		String password = employee.getPassword();
		//2：使用用户名作为查询条件，查询员工表，获取当前用户名对应的信息
		Employee emp = employeeService.findEmployeeByUserId(userId,password);
		//3：将查询的对象（惟一）放置到Session中
		if(emp != null){
			if(userId.equals(emp.getName()) || password.equals(emp.getPassword())){
				SessionContext.setUser(emp);
				return "success";
			}	
		}else{
			alertString = "账号不存在，请重新输入!";
			//this.getRequest().setAttribute("error",alertString);
			return "login";
		}
		return "";	
	}

	/**
	 * 标题
	 * @return
	 */
	public String top() {
		return "top";
	}
	
	/**
	 * 左侧菜单
	 * @return
	 */
	public String left() {
		return "left";
	}
	
	/**
	 * 主页显示
	 * @return
	 */
	public String welcome() {
		return "welcome";
	}
	
	/**退出系统*/
	public String logout(){
		//清空Session
		SessionContext.setUser(null);
		return "login";
	}
	
	/**
	 * 列表
	 */
	public String showList(){	
		list = this.employeeService.getEmployeeByprocDefinitionId();
		ValueContext.putValueContext("list", list);
		return "showList";
	}
	
	/**
	 * 跳转
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	public String toInputPage() throws UnsupportedEncodingException{
		return "toInputPage";
	}
	
	/**
	 * 保存数据
	 * @return
	 */
	public String save(){		
		this.employeeService.saveEmployee(employee);		
		return showList();
		
	}
	
	/**
	 * 跳转到编辑页面
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public String toEditPage() throws UnsupportedEncodingException{
		employee = this.employeeService.getEmployeeById(employee.getId());	
		return "toEditPage";
	}
	
	/**
	 * 修改数据
	 * @return
	 */
	public String edit(){	
		this.employeeService.updateEmployee(employee);		
		return showList();
	}
	
	/**
	 * 删除数据
	 * @return
	 */
	public String delete(){
		this.employeeService.delEmployee(employee);	
		return "delete";
	}
	
	public String toFindPage(){	
		return "toFindPage";
	}
	
	public String find(){	
		return "find";
	}

	
	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public IEmployeeService getEmployeeService() {
		return employeeService;
	}

	public String getAlertString() {
		return alertString;
	}

	public void setAlertString(String alertString) {
		this.alertString = alertString;
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}
	
	@Override
	public Employee getModel() {
		return employee;
	}
	
	public void setEmployeeService(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}
	
}
