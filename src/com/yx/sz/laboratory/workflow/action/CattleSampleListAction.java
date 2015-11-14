package com.yx.sz.laboratory.workflow.action;

import java.util.List;

import cn.itcast.ssh.utils.ValueContext;

import com.opensymphony.xwork2.ModelDriven;
import com.yx.sz.laboratory.util.SessionContext;
import com.yx.sz.laboratory.workflow.bean.CattleSampleList;
import com.yx.sz.laboratory.workflow.service.ICattleSampleListService;

public class CattleSampleListAction implements ModelDriven<CattleSampleList> {
	CattleSampleList sl = new CattleSampleList();
	private ICattleSampleListService cattleService;

	public String list() {
		List<CattleSampleList> list = cattleService.list();
		ValueContext.putValueContext("list", list);
		return "list";
	}

	public String toAdd() {
		return "toAdd";
	}

	public String toEdit() {
		sl = cattleService.findById(sl.getId());
		ValueContext.putValueStack(sl);
		return "toEdit";
	}

	public String add() {
		sl.setUserId(SessionContext.get().getUserId());
		sl.setUserName(SessionContext.get().getName());
		cattleService.save(sl);
		return "toList";
	}

	public String update() {
		sl.setUserId(SessionContext.get().getUserId());
		sl.setUserName(SessionContext.get().getName());
		cattleService.update(sl);
		return "toList";
	}

	public String delete() {
		cattleService.delete(sl);
		return "toList";
	}

	@Override
	public CattleSampleList getModel() {
		return sl;
	}

	public CattleSampleList getSl() {
		return sl;
	}

	public void setSl(CattleSampleList sl) {
		this.sl = sl;
	}

	public ICattleSampleListService getCattleService() {
		return cattleService;
	}

	public void setCattleService(ICattleSampleListService cattleService) {
		this.cattleService = cattleService;
	}

}
