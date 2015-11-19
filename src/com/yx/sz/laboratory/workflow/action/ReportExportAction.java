package com.yx.sz.laboratory.workflow.action;

import java.io.InputStream;
import java.util.List;

import com.opensymphony.xwork2.ModelDriven;
import com.yx.sz.laboratory.proStandLibrary.bean.CheckReport;
import com.yx.sz.laboratory.proStandLibrary.service.CheckReportService;
import com.yx.sz.laboratory.workflow.bean.SampleList;
import com.yx.sz.laboratory.workflow.service.ICattleSampleListService;
import com.yx.sz.laboratory.workflow.service.IForestFoodSampleListService;
import com.yx.sz.laboratory.workflow.service.ILaboratoryManagementService;
import com.yx.sz.laboratory.workflow.service.IPollutionFreeSampleListService;
import com.yx.sz.laboratory.workflow.service.IQualitySampleListService;
import com.yx.sz.laboratory.workflow.service.ISampleListService;

import cn.itcast.ssh.utils.Constants;
import cn.itcast.ssh.utils.ReportGenerator;
import cn.itcast.ssh.web.form.WorkflowBean;

public class ReportExportAction implements ModelDriven<WorkflowBean> {
SampleList samplelist = new SampleList();
	

	private WorkflowBean workflowBean = new WorkflowBean();
	
	private ILaboratoryManagementService laboratoryManagementService;
	private CheckReportService checkReportService;
	private String fileName;
	private ISampleListService samplelistService;
//	//private FoodParametersEquipmentService foodParametersEquipmentService;
//	private FoodParamAndEquipmentService fpeService;
//	
//	private TaskService taskService;
//	
//	
//	private SubProcessHistoryService subProcessHistoryService;
//	
//	private List<CheckReport> list = new ArrayList<CheckReport>();
//	
//	private List<FoodParamAndEquipment> foodlist = new ArrayList<FoodParamAndEquipment>();
//	
//	private List<CheckReport> listarray = new ArrayList<CheckReport>();
//	
//	SubProcessHistory subprocessHistory = new SubProcessHistory();
//	
	private IPollutionFreeSampleListService pollutionFreeService;
	private IQualitySampleListService qualityService;
	private IForestFoodSampleListService forestService;
	private ICattleSampleListService cattleService;
	
	private InputStream inputStream;
	
	public String execute(){
		
		return "success";
	}
	
	
	public InputStream getInputStream() {
		this.fileName = "SampleReport.doc";
		String processTypeName = "SampleList";
		List<CheckReport> rList = checkReportService.getCheckReportListBySampleListId(workflowBean.getId().intValue());
		try{
		switch(workflowBean.getProcessType()){
			case Constants.PROCESS_TYPE_SAMPLE_LIST:
				//return ReportGenerator.exportQualityReport(samplelistService.findSampleListById(workflowBean.getId()), rList);
			case Constants.PROCESS_TYPE_CATTLE_SAMPLE_LIST:
				return ReportGenerator.exportCattleReport(cattleService.findById(workflowBean.getId()), rList);
			case Constants.PROCESS_TYPE_FOREST_LIST:
				return ReportGenerator.exportForestReport(forestService.findById(workflowBean.getId()), rList);
			case Constants.PROCESS_TYPE_QUALITY_LIST:
				return ReportGenerator.exportQualityReport(qualityService.findById(workflowBean.getId()), rList);
			case Constants.PROCESS_TYPE_PF_LIST:
				return ReportGenerator.exportPollutionFreeReport(pollutionFreeService.findById(workflowBean.getId()), rList);
			default:
				break;
		}
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
		
	}
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}


	@Override
	public WorkflowBean getModel() {
		return workflowBean;
	}

	public SampleList getSamplelist() {
		return samplelist;
	}

	public void setSamplelist(SampleList samplelist) {
		this.samplelist = samplelist;
	}

	public WorkflowBean getWorkflowBean() {
		return workflowBean;
	}

	public void setWorkflowBean(WorkflowBean workflowBean) {
		this.workflowBean = workflowBean;
	}

	public ILaboratoryManagementService getLaboratoryManagementService() {
		return laboratoryManagementService;
	}

	public void setLaboratoryManagementService(ILaboratoryManagementService laboratoryManagementService) {
		this.laboratoryManagementService = laboratoryManagementService;
	}

	public CheckReportService getCheckReportService() {
		return checkReportService;
	}

	public void setCheckReportService(CheckReportService checkReportService) {
		this.checkReportService = checkReportService;
	}


	public IPollutionFreeSampleListService getPollutionFreeService() {
		return pollutionFreeService;
	}


	public void setPollutionFreeService(IPollutionFreeSampleListService pollutionFreeService) {
		this.pollutionFreeService = pollutionFreeService;
	}


	public IQualitySampleListService getQualityService() {
		return qualityService;
	}


	public void setQualityService(IQualitySampleListService qualityService) {
		this.qualityService = qualityService;
	}


	public IForestFoodSampleListService getForestService() {
		return forestService;
	}


	public void setForestService(IForestFoodSampleListService forestService) {
		this.forestService = forestService;
	}


	public ICattleSampleListService getCattleService() {
		return cattleService;
	}


	public void setCattleService(ICattleSampleListService cattleService) {
		this.cattleService = cattleService;
	}


	public ISampleListService getSamplelistService() {
		return samplelistService;
	}


	public void setSamplelistService(ISampleListService samplelistService) {
		this.samplelistService = samplelistService;
	}


	public String getFileName() {
		return fileName;
	}


	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
