package com.yx.sz.laboratory.instrumenttation.dao;

import java.util.List;
import com.yx.sz.laboratory.instrumenttation.bean.InstrumentTation;

public interface InstrumentTationDao {
	
	public void updaInstrumentTation(InstrumentTation instrumentTation);
	
	public void saveInstrumentTation(InstrumentTation instrumentTation);
	
	public void delInstrumentTation(InstrumentTation instrumentTation);
		
	public InstrumentTation getInstrumentTationById(int id);
	
	public List getInstrumentTationList();

	public void batchSave(List<InstrumentTation> itList);

}
