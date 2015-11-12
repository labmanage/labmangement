package com.yx.sz.laboratory.util;
import java.util.ArrayList;
import java.util.List;

import org.activiti.cdi.impl.ProcessDeployer;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;
import org.activiti.engine.impl.persistence.entity.ProcessDefinitionEntity;
import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.yx.sz.laboratory.organization.service.ILabGroupUserRuleService;

import cn.itcast.ssh.domain.Employee;
import cn.itcast.ssh.service.IEmployeeService;

/**
 * 员工经理任务分配
 *
 */
@SuppressWarnings("serial")
public class ManagerTaskHandler implements TaskListener {

	@Override
	public void notify(DelegateTask delegateTask) {
		System.out.println("流程实例ID：==========================="+delegateTask.getProcessInstanceId());
		System.out.println("流程任务ID：==========================="+delegateTask.getTaskDefinitionKey());
		System.out.println("流程定义ID：==========================="+delegateTask.getProcessDefinitionId());
		System.out.println("流程名称：=========环节名称=================="+delegateTask.getName());
		
		WebApplicationContext webac = WebApplicationContextUtils.getWebApplicationContext(ServletActionContext.getServletContext());
		RepositoryService repositoryService = (RepositoryService) webac.getBean("repositoryService");
		
		ProcessDefinitionEntity processDefinitionEntity =  (ProcessDefinitionEntity)repositoryService
						.createProcessDefinitionQuery()
						.processDefinitionId(delegateTask.getProcessDefinitionId()).singleResult();
		String deploymentId = processDefinitionEntity.getDeploymentId();
		System.out.println("流程部署ID--------------------="+deploymentId);
		//从web中获取spring容器
		WebApplicationContext webc = WebApplicationContextUtils.getWebApplicationContext(ServletActionContext.getServletContext());
		ILabGroupUserRuleService labGroupUserRuleService = (ILabGroupUserRuleService) webc.getBean("labGroupUserRuleservice");
			
		List<String> list = labGroupUserRuleService.getUserNameByprocDefinitionIdAndUserTask(deploymentId, delegateTask.getName());
		for(String strname:list){
			System.out.println("获取的代办人"+strname);
		}
				
		/**第一步首先获取流程环节名称*/
		
		/**第二步根据环节名称到群组表中找到待办人*/
		
		/**第三步将代办人信息塞入容器*/
		
		/**懒加载异常*/
//		Employee employee = SessionContext.get();
//		//设置个人任务的办理人
//		delegateTask.setAssignee(employee.getManager().getName());
		/**从新查询当前用户，再获取当前用户对应的领导*/
		Employee employee = SessionContext.get();
		//当前用户
		String name = employee.getName();
		String password = employee.getPassword();
		//使用当前用户名查询用户的详细信息
		//从web中获取spring容器
		WebApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(ServletActionContext.getServletContext());
		IEmployeeService employeeService = (IEmployeeService) ac.getBean("employeeService");
		Employee emp = employeeService.findEmployeeByName(name,password);
		//设置个人任务的办理人
		//delegateTask.setAssignee(emp.getManager().getName());
//		List list =  new ArrayList();
//		list.add("大拿");
//		list.add("赵四");
	//	delegateTask.addCandidateUser("赵四");
		delegateTask.addCandidateUsers(list);
	}

}
