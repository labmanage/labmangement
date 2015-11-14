package com.yx.sz.laboratory.workflow.action;

import java.util.List;

import cn.itcast.ssh.utils.SessionContext;
import cn.itcast.ssh.utils.ValueContext;

import com.opensymphony.xwork2.ModelDriven;
import com.yx.sz.laboratory.workflow.bean.ForestFoodSampleList;
import com.yx.sz.laboratory.workflow.service.IForestFoodSampleListService;

public class ForestFoodSampleListAction implements
		ModelDriven<ForestFoodSampleList> {
	ForestFoodSampleList sl = new ForestFoodSampleList();
	private IForestFoodSampleListService forestService;

	public String list() {
		List<ForestFoodSampleList> list = forestService.list();
		ValueContext.putValueContext("list", list);
		return "list";
	}

	public String toAdd() {
		return "toAdd";
	}

	public String toEdit() {
		sl = forestService.findById(sl.getId());
		ValueContext.putValueStack(sl);
		return "toEdit";
	}

	public String add() {
		sl.setUserId(SessionContext.get().getUserId());
		sl.setUserName(SessionContext.get().getName());
		forestService.save(sl);
		return "toList";
	}

	public String update() {
		sl.setUserId(SessionContext.get().getUserId());
		sl.setUserName(SessionContext.get().getName());
		forestService.update(sl);
		return "toList";
	}

	public String delete() {
		forestService.delete(sl);
		return "toList";
	}

	@Override
	public ForestFoodSampleList getModel() {
		return sl;
	}

	public ForestFoodSampleList getSl() {
		return sl;
	}

	public void setSl(ForestFoodSampleList sl) {
		this.sl = sl;
	}

	public IForestFoodSampleListService getForestService() {
		return forestService;
	}

	public void setForestService(IForestFoodSampleListService forestService) {
		this.forestService = forestService;
	}

}
