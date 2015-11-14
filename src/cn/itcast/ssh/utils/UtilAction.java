package cn.itcast.ssh.utils;

import java.util.List;

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
	private int productType;
	
	
	public String getFoodList(){
		List<FoodParamAndEquipment> list = fpeService.getTopAll();
		ValueContext.putValueContext("list", list);
		return "foodPicker";
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
	
	
	
}
