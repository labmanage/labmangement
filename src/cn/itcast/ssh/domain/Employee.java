package cn.itcast.ssh.domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.yx.sz.laboratory.organization.bean.LabPrivilege;
import com.yx.sz.laboratory.organization.bean.LabRole;
import com.yx.sz.laboratory.util.DbUtil;

/**
 * 用户表
 */
public class Employee {
	private Long id;//主键ID
	private String userId;
	private String name;//用户名
	private String password;//密码
	private String email;//电子邮箱
	private LabRole role;//角色
	private Employee manager;
	private String number;//序号
	private String sex;//性别
	private String age;//年龄
	private String education;//文化程度
	private String jobTitle;//职称
	private String major;//所学专业
	private String technologyYear;//从事本技术领域年限
	private String departmentJobs;//部门岗位
	private String jobYear;//本岗位年限
	private String remark;//备注
	
	/**
	 * 判断当前用户是否有访问当前url的权限，规则：
	 * 1、如果当前url不存在于权限表中，返回true
	 * 2、如果当前url存在于权限表中，但是用户对应的角色没有该权限，返回false
	 * 3、如果当前url存在于权限表中，且用户对应的角色拥有该权限，返回true
	 * @param href 当前url
	 * @return
	 */
	public boolean hasPrivilege(String href){
		//超级管理员不验证权限
		if(this.userId.equals("admin")) return true;
		
		DbUtil db = new DbUtil();
		String sql1 = "select url from lab_privilege where id in (select p_id from lab_role_privilege where role_id in (select role_id from a_employee where id = ?))";
		String sql2 = "select url from lab_privilege where url = '"+href+"'";
		Connection conn = db.getConn();
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean hasPrivilege = false;
		try{
			rs = db.getRs(conn, sql2);
			boolean isExistInPrivilege = false;
			while(rs.next()){
				isExistInPrivilege = true;
			}
			//如果不存在于权限表中，则不拦截。
			if(!isExistInPrivilege){
				return true;
			}
			if(isExistInPrivilege){
				ps = conn.prepareStatement(sql1);
				ps.setLong(1, this.id);
				rs = ps.executeQuery();
				while(rs.next()){
					String url = rs.getString(1);
					if(url.equals(href)){
						hasPrivilege = true ;
					}
				}
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			db.closeRs(rs);
			db.closeStmt(ps);
			db.closeConn(conn);
		}
		return hasPrivilege;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

	public LabRole getRole() {
		return role;
	}
	public void setRole(LabRole role) {
		this.role = role;
	}
	public Employee getManager() {
		return manager;
	}
	public void setManager(Employee manager) {
		this.manager = manager;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getTechnologyYear() {
		return technologyYear;
	}
	public void setTechnologyYear(String technologyYear) {
		this.technologyYear = technologyYear;
	}
	public String getDepartmentJobs() {
		return departmentJobs;
	}
	public void setDepartmentJobs(String departmentJobs) {
		this.departmentJobs = departmentJobs;
	}
	public String getJobYear() {
		return jobYear;
	}
	public void setJobYear(String jobYear) {
		this.jobYear = jobYear;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
}

