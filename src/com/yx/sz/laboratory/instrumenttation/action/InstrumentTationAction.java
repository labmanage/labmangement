package com.yx.sz.laboratory.instrumenttation.action;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import cn.itcast.ssh.utils.ValueContext;

import com.opensymphony.xwork2.ModelDriven;
import com.yx.sz.laboratory.instrumenttation.bean.InstrumentTation;
import com.yx.sz.laboratory.instrumenttation.service.InstrumentTationService;

public class InstrumentTationAction implements ModelDriven<InstrumentTation> {

	InstrumentTation instrumentTation = new InstrumentTation();
	
	private InstrumentTationService instrumentTationService;
	
	List list = new ArrayList();
	
	/**
	 * 列表
	 */
	public String showList(){	
		list = this.instrumentTationService.getInstrumentTationByprocDefinitionId();
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
		this.instrumentTationService.saveInstrumentTation(instrumentTation);		
		return showList();
		
	}
	
	public String toEditPage() throws UnsupportedEncodingException{
		instrumentTation = this.instrumentTationService.getInstrumentTationById(instrumentTation.getId());	
		return "toEditPage";
	}
	
	/**
	 * 修改数据
	 * @return
	 */
	public String edit(){	
		this.instrumentTationService.updateInstrumentTation(instrumentTation);		
		return showList();
	}
	
	/**
	 * 删除数据
	 * @return
	 */
	public String delete(){
		this.instrumentTationService.delInstrumentTation(instrumentTation);	
		return "delete";
	}
	
	public String toFindPage(){	
		return "toFindPage";
	}
	
	public String find(){	
		return "find";
	}
	
	public InstrumentTation getInstrumentTation() {
		return instrumentTation;
	}

	public void setInstrumentTation(InstrumentTation instrumentTation) {
		this.instrumentTation = instrumentTation;
	}

	public InstrumentTationService getInstrumentTationService() {
		return instrumentTationService;
	}

	public void setInstrumentTationService(
			InstrumentTationService instrumentTationService) {
		this.instrumentTationService = instrumentTationService;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	@Override
	public InstrumentTation getModel() {
		return instrumentTation;
	}

}
