package com.yx.sz.laboratory.note.service;

import java.util.List;

import com.yx.sz.laboratory.note.bean.NoteBean;
import com.yx.sz.laboratory.note.dao.NoteDao;

public class NoteServiceImpl implements NoteService{
	
	private NoteDao noteDao;

	@Override
	public List<NoteBean> list() {
		return noteDao.list();
	}

	@Override
	public NoteBean getById(long id) {
		return noteDao.getByID(id);
	}

	@Override
	public void save(NoteBean nb) {
		noteDao.save(nb);
	}

	@Override
	public void delete(NoteBean nb) {
		noteDao.delete(nb);
	}

	@Override
	public void update(NoteBean nb) {
		noteDao.edit(nb);
	}

	public NoteDao getNoteDao() {
		return noteDao;
	}

	public void setNoteDao(NoteDao noteDao) {
		this.noteDao = noteDao;
	}

	@Override
	public List<NoteBean> find(NoteBean nb) {
		return noteDao.find(nb);
	}

	
}
