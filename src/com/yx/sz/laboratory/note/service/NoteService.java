package com.yx.sz.laboratory.note.service;

import java.util.List;

import com.yx.sz.laboratory.note.bean.NoteBean;

public interface NoteService {

	List<NoteBean> list();
	
	NoteBean getById(long id);
	
	void save(NoteBean nb);
	
	void delete(NoteBean nb);
	
	void update(NoteBean nb);

	List<NoteBean> find(NoteBean nb);
}
