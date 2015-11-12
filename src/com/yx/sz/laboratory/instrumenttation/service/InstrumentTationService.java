package com.yx.sz.laboratory.instrumenttation.service;

import java.util.List;
import com.yx.sz.laboratory.instrumenttation.bean.InstrumentTation;

public interface InstrumentTationService {

	public void updateInstrumentTation(InstrumentTation instrumentTation);
	
	public void saveInstrumentTation(InstrumentTation instrumentTation);
	
	public void delInstrumentTation(InstrumentTation instrumentTation);
	
	public List getInstrumentTationByprocDefinitionId();
	
	public InstrumentTation getInstrumentTationById(int id);

}
