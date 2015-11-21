package com.yx.sz.laboratory.workflow.action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import cn.itcast.ssh.utils.SessionContext;
import cn.itcast.ssh.utils.ValueContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.yx.sz.laboratory.proStandLibrary.bean.CheckReport;
import com.yx.sz.laboratory.proStandLibrary.bean.FoodParametersEquipment;
import com.yx.sz.laboratory.proStandLibrary.service.CheckReportService;
import com.yx.sz.laboratory.proStandLibrary.service.FoodParametersEquipmentService;
import com.yx.sz.laboratory.proStandLibrary.service.NonFoodParametersEquipmentService;
import com.yx.sz.laboratory.util.DbUtil;
import com.yx.sz.laboratory.workflow.bean.SampleList;
import com.yx.sz.laboratory.workflow.service.ISampleListService;

public class SampleListAction extends ActionSupport implements ModelDriven<SampleList> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	SampleList samplelist = new SampleList();
	
	private ISampleListService samplelistService;
	
	private NonFoodParametersEquipmentService nonfoodService;
	
	private FoodParametersEquipmentService foodService;
	
	private CheckReportService checkReportService;
	
	List<FoodParametersEquipment> list = new ArrayList<FoodParametersEquipment>();
	
	FoodParametersEquipment foodParametersEquipment = new FoodParametersEquipment();

	/**
	 * 抽样单首页显示
	 * @return
	 */
	public String home(){
		//1：查询所有的抽样单信息（对应SampleList），返回List<SampleList>
		List<SampleList> list = samplelistService.findSampleListList(); 
		//放置到上下文对象中
		ValueContext.putValueContext("list", list);
		return "home";
	}
	
	/**
	 * 添加申请
	 * @return
	 */
	public String input(){
		DbUtil db = new DbUtil();
		
		String sql1 = "SELECT DISTINCT(chanpinMc) FROM  t_foodparametersequipment";
		String sql2 = "SELECT DISTINCT(chanpinMc) FROM t_nonfoodparametersequipment";
		
		Connection conn =db.getConn();
		ResultSet rs1 = db.getRs(conn, sql1);
		ResultSet rs2 = db.getRs(conn, sql2);
		try {
			while(rs1.next()){
				foodParametersEquipment = new FoodParametersEquipment();
				foodParametersEquipment.setChanpinMc(rs1.getString(1));
				list.add(foodParametersEquipment);
			}
			while(rs2.next()){
				foodParametersEquipment = new FoodParametersEquipment();
				foodParametersEquipment.setChanpinMc(rs2.getString(1));
				list.add(foodParametersEquipment);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			db.closeRs(rs1);
			db.closeRs(rs2);
			db.closeConn(conn);
		}
		
		//1：获取抽样单ID
		Long id = samplelist.getId();
		
		//修改
		if(id!=null){
			//2：使用抽样单ID，查询抽样单信息，
			SampleList sampleList = samplelistService.findSampleListById(id);
			//3：将抽样单信息放置到栈顶，页面使用struts2的标签，支持表单回显
			ValueContext.putValueStack(sampleList);
		}
		//新增
		return "input";
	}
	
	/**
	 * 保存/更新，抽样单申请
	 * 
	 * */
	public String save() {
		
		//保存抽检样品检验内容
		String sampleName ="";
		int id = 0;
		if(samplelist != null){
			sampleName = samplelist.getSampleName();
			id  = Integer.parseInt(samplelist.getId()+"");
		}
		
	
		
		//执行保存
		samplelist.setUserName(SessionContext.get().getName());
		samplelist.setUserId(SessionContext.get().getUserId());
		samplelistService.saveSampleList(samplelist);
		return "save";
	}
	
	/**
	 * 删除，抽样单申请
	 * 
	 * */
	public String delete(){
		//1：获取抽样单ID
		Long id = samplelist.getId();
		//执行删除
		samplelistService.deleteSampleListById(id);
		return "save";
	}
	
	@Override
	public SampleList getModel() {
		
		return samplelist;
	}

	public SampleList getSamplelist() {
		return samplelist;
	}

	public void setSamplelist(SampleList samplelist) {
		this.samplelist = samplelist;
	}

	public ISampleListService getSamplelistService() {
		return samplelistService;
	}

	public void setSamplelistService(ISampleListService samplelistService) {
		this.samplelistService = samplelistService;
	}

	public NonFoodParametersEquipmentService getNonfoodService() {
		return nonfoodService;
	}

	public void setNonfoodService(NonFoodParametersEquipmentService nonfoodService) {
		this.nonfoodService = nonfoodService;
	}

	public FoodParametersEquipmentService getFoodService() {
		return foodService;
	}

	public void setFoodService(FoodParametersEquipmentService foodService) {
		this.foodService = foodService;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public CheckReportService getCheckReportService() {
		return checkReportService;
	}

	public void setCheckReportService(CheckReportService checkReportService) {
		this.checkReportService = checkReportService;
	}


}
