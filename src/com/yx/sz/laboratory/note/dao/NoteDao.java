package com.yx.sz.laboratory.note.dao;

import java.util.List;

import com.yx.sz.laboratory.note.bean.NoteBean;

public interface NoteDao {
	List<NoteBean> list();
	void save(NoteBean nb);
	void delete(NoteBean nb);
	void edit(NoteBean nb);
	NoteBean getByID(long id);
	List<NoteBean> find(NoteBean nb);
}
