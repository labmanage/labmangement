package com.yx.sz.laboratory.workflow.action;

import cn.itcast.ssh.utils.ValueContext;

import com.opensymphony.xwork2.ModelDriven;
import com.yx.sz.laboratory.util.SessionContext;
import com.yx.sz.laboratory.workflow.bean.PollutionFreeSampleList;
import com.yx.sz.laboratory.workflow.service.IPollutionFreeSampleListService;

public class PollutionFreeSampleListAction implements
		ModelDriven<PollutionFreeSampleList> {
	PollutionFreeSampleList sl = new PollutionFreeSampleList();
	private IPollutionFreeSampleListService pollutionFreeService;

	public String list() {
		ValueContext.putValueContext("list", pollutionFreeService.list());
		return "list";
	}

	public String toAdd() {
		return "toAdd";
	}

	public String toEdit() {
		sl = pollutionFreeService.findById(sl.getId());
		ValueContext.putValueStack(sl);
		return "toEdit";
	}

	public String add() {
		sl.setUserId(SessionContext.get().getUserId());
		sl.setUserName(SessionContext.get().getName());
		pollutionFreeService.save(sl);
		return "toList";
	}

	public String update() {
		sl.setUserId(SessionContext.get().getUserId());
		sl.setUserName(SessionContext.get().getName());
		pollutionFreeService.update(sl);
		return "toList";
	}

	public String delete() {
		pollutionFreeService.delete(sl);
		return "toList";
	}

	@Override
	public PollutionFreeSampleList getModel() {
		return sl;
	}

	public PollutionFreeSampleList getSl() {
		return sl;
	}

	public void setSl(PollutionFreeSampleList sl) {
		this.sl = sl;
	}

	public IPollutionFreeSampleListService getPollutionFreeService() {
		return pollutionFreeService;
	}

	public void setPollutionFreeService(
			IPollutionFreeSampleListService pollutionFreeService) {
		this.pollutionFreeService = pollutionFreeService;
	}

}
