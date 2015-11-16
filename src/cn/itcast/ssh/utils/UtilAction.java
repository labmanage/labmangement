package cn.itcast.ssh.utils;

import java.util.List;

import cn.itcast.ssh.service.IEmployeeService;

import com.yx.sz.laboratory.organization.bean.LabPrivilege;
import com.yx.sz.laboratory.organization.service.ILabPrivilegeService;
import com.yx.sz.laboratory.proStandardLib.bean.FoodParamAndEquipment;
import com.yx.sz.laboratory.proStandardLib.service.FoodParamAndEquipmentService;
import com.yx.sz.laboratory.proStandardLib.service.IFoodParamService;
import com.yx.sz.laboratory.proStandardLib.service.IProductStandardService;
import com.yx.sz.laboratory.proStandardLib.service.NonFoodParamAndEquipmentService;
import com.yx.sz.laboratory.proStandardLib.service.NonFoodParamService;


public class UtilAction {
	private IProductStandardService fsService;
	private IFoodParamService fpService;
	private FoodParamAndEquipmentService fpeService;
	private NonFoodParamService nfpService;
	private NonFoodParamAndEquipmentService nfpeService;
	private IEmployeeService employeeService;
	private ILabPrivilegeService privilegeService;
	private int productType;
	
	public String getPrivilegeList(){
		List<LabPrivilege> list = privilegeService.list();
		ValueContext.putValueContext("list", list);
		return "privilegePicker";
	}
	
	public String getFoodList(){
		List<FoodParamAndEquipment> list = fpeService.getTopAll();
		ValueContext.putValueContext("list", list);
		return "foodPicker";
	}
	
	public String getUserList(){
		ValueContext.putValueContext("list", employeeService.list());
		return "userPicker";
	}
	
	public String getUnroledUserList(){
		ValueContext.putValueContext("list", employeeService.unRoledlist());
		return "userPicker";
	}
	
	
	public String getNonFoodList(){
		return "nonFoodList";
	}
	
	public int getProductType() {
		return productType;
	}
	public void setProductType(int productType) {
		this.productType = productType;
	}
	public IProductStandardService getFsService() {
		return fsService;
	}
	public void setFsService(IProductStandardService fsService) {
		this.fsService = fsService;
	}
	public IFoodParamService getFpService() {
		return fpService;
	}
	public void setFpService(IFoodParamService fpService) {
		this.fpService = fpService;
	}
	public FoodParamAndEquipmentService getFpeService() {
		return fpeService;
	}
	public void setFpeService(FoodParamAndEquipmentService fpeService) {
		this.fpeService = fpeService;
	}
	public NonFoodParamService getNfpService() {
		return nfpService;
	}
	public void setNfpService(NonFoodParamService nfpService) {
		this.nfpService = nfpService;
	}
	public NonFoodParamAndEquipmentService getNfpeService() {
		return nfpeService;
	}
	public void setNfpeService(NonFoodParamAndEquipmentService nfpeService) {
		this.nfpeService = nfpeService;
	}

	public IEmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public ILabPrivilegeService getPrivilegeService() {
		return privilegeService;
	}

	public void setPrivilegeService(ILabPrivilegeService privilegeService) {
		this.privilegeService = privilegeService;
	}
}
