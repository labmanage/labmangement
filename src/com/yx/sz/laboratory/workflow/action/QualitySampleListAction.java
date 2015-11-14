package com.yx.sz.laboratory.workflow.action;

import java.util.List;

import cn.itcast.ssh.utils.SessionContext;
import cn.itcast.ssh.utils.ValueContext;

import com.opensymphony.xwork2.ModelDriven;
import com.yx.sz.laboratory.workflow.bean.QualitySampleList;
import com.yx.sz.laboratory.workflow.service.IQualitySampleListService;

public class QualitySampleListAction implements ModelDriven<QualitySampleList> {
	QualitySampleList sl = new QualitySampleList();
	private IQualitySampleListService qualityService;

	public String list() {
		List<QualitySampleList> list = qualityService.list();
		ValueContext.putValueContext("list", list);
		return "list";
	}

	public String toAdd() {
		return "toAdd";
	}

	public String toEdit() {
		sl = qualityService.findById(sl.getId());
		ValueContext.putValueStack(sl);
		return "toEdit";
	}

	public String add() {
		sl.setUserId(SessionContext.get().getUserId());
		sl.setUserName(SessionContext.get().getName());
		qualityService.save(sl);
		return "toList";
	}

	public String update() {
		sl.setUserId(SessionContext.get().getUserId());
		sl.setUserName(SessionContext.get().getName());
		qualityService.update(sl);
		return "toList";
	}

	public String delete() {
		qualityService.delete(sl);
		return "toList";
	}

	@Override
	public QualitySampleList getModel() {
		return sl;
	}

	public QualitySampleList getSl() {
		return sl;
	}

	public void setSl(QualitySampleList sl) {
		this.sl = sl;
	}

	public IQualitySampleListService getQualityService() {
		return qualityService;
	}

	public void setQualityService(IQualitySampleListService qualityService) {
		this.qualityService = qualityService;
	}

}
