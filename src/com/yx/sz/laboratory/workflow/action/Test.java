package com.yx.sz.laboratory.workflow.action;

import java.util.List;
import java.util.Map;

import org.activiti.engine.impl.persistence.entity.ExecutionEntity;
import org.activiti.engine.impl.pvm.delegate.ActivityExecution;

public class Test {
	/**
	 * 获取多实体子流程的执行用户集合
	 * @param execution
	 * @return
	 * @throws Execption
	 */
//	public List<String> getMultipleUser(ActivityExecution execution) throws Exception{
//		
//		String nodeId=execution.getActivity().getId();
//		ExecutionEntity executionEnt=(ExecutionEntity) execution;
//		
//		List<String> userIds=(List<String>)execution.getVariable(BpmConst.SUBPRO_MULTI_USERIDS);
//		
//		if(userIds!=null) return userIds;
//		Map<String,FlowNode> nodeMap= NodeCache.getByActDefId(executionEnt.getProcessDefinitionId());
//		FlowNode subProcessNode=nodeMap.get(nodeId);
//		FlowNode firstNode=subProcessNode.getSubFirstNode();
//		
//		FlowNode secodeNode=firstNode.getNextFlowNodes().get(0);
//		
//		List<String> userList=nodeUserMapLocal.get().get(secodeNode.getNodeId());
//		
//		logger.debug("userList size:" + userList.size());
//		
//		execution.setVariable(BpmConst.SUBPRO_MULTI_USERIDS, userList);
//		return userList;
//	}
}
