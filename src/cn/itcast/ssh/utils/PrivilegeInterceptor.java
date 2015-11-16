package cn.itcast.ssh.utils;

import java.util.Set;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.yx.sz.laboratory.organization.bean.LabPrivilege;
import com.yx.sz.laboratory.organization.bean.LabRole;

public class PrivilegeInterceptor implements Interceptor{

	@Override
	public void destroy() {
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 拦截条件：存在于权限表中并且该用户的角色不包含该权限
	 */
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		String actionName = invocation.getProxy().getActionName();
		
		if(null != actionName){
			if(actionName.indexOf("?")>0){
				actionName = actionName.split("\\?")[0];
			}
			if(actionName.indexOf(".")>0){
				actionName = actionName.split("\\.")[0];
			}
			
			String[] commonPrivileges = {"loginAction_top","loginAction_left","loginAction_welcome","loginAction_login"};
			for(String s: commonPrivileges){
				if(s.equals(actionName)){
					return invocation.invoke();
				}
			}
		}
		if(!SessionContext.get().hasPrivilege(actionName)){
			return "noAuth";
		}
		return invocation.invoke();
	}

}
