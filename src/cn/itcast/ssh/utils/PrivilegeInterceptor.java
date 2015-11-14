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

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		
		String actionName = invocation.getProxy().getActionName();
		actionName = actionName.split("\\.")[0];
		boolean isPrivilegeMatch = false;
		if(!actionName.startsWith("loginAction_")){
			LabRole role = SessionContext.get().getRole();
			String userName = SessionContext.get().getUserId();
			if(null != role){
				Set<LabPrivilege> pSet = role.getPrivileges();
				if(null != pSet && pSet.size() > 0){
					for(LabPrivilege p: pSet){
						if(p.getUrl().equals(actionName)){
							isPrivilegeMatch = true;
						}
					}
				}
				
			}
			if(!isPrivilegeMatch && !userName.equals("admin")){
				return "noAuth";
			}
		}
		
		
		
		return invocation.invoke();
	}

}
