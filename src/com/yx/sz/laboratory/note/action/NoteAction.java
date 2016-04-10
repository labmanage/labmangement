package com.yx.sz.laboratory.note.action;

import java.util.Date;

import cn.itcast.ssh.utils.ValueContext;

import com.opensymphony.xwork2.ModelDriven;
import com.yx.sz.laboratory.note.bean.NoteBean;
import com.yx.sz.laboratory.note.service.NoteService;
import com.yx.sz.laboratory.util.SessionContext;

public class NoteAction implements ModelDriven<NoteBean>{

	NoteBean nb = new NoteBean();
	private NoteService noteService;
	
	
	
	public String list(){
		ValueContext.putValueContext("list", noteService.list());
		return "list";
	};
	public String toAdd(){
		return "toAdd";
	};
	public String add(){
		nb.setPublisher(SessionContext.get());
		nb.setCreateTime(new Date());
		noteService.save(nb);
		return "toList";
	};
	public String delete(){
		noteService.delete(nb);
		return "toList";
	}
	public String toEdit(){
		NoteBean noteBean = noteService.getById(nb.getId());
		ValueContext.putValueStack(noteBean);
		return "toEdit";
	}
	public String edit(){
		nb.setPublisher(SessionContext.get());
		nb.setCreateTime(new Date());
		noteService.update(nb);
		return "toList";
	}
	public String preView(){
		NoteBean noteBean = noteService.getById(nb.getId());
		ValueContext.putValueStack(noteBean);
		return "preView";
	}
	
	public String query(){
		ValueContext.putValueContext("list", noteService.find(nb));
		return "list";
	}
	
	
	
	
	
	
	
	public NoteBean getNb() {
		return nb;
	}

	public void setNb(NoteBean nb) {
		this.nb = nb;
	}

	@Override
	public NoteBean getModel() {
		return nb;
	}
	public NoteService getNoteService() {
		return noteService;
	}
	public void setNoteService(NoteService noteService) {
		this.noteService = noteService;
	}
	

}
