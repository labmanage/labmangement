package com.yx.sz.laboratory.workflow.service.impl;

import java.util.List;

import cn.itcast.ssh.utils.SessionContext;

import com.yx.sz.laboratory.workflow.bean.SampleList;
import com.yx.sz.laboratory.workflow.dao.ISampleListDao;
import com.yx.sz.laboratory.workflow.service.ISampleListService;

public class SampleListServiceImpl implements ISampleListService {

	private ISampleListDao sampleListDao;

	public void setSampleListDao(ISampleListDao sampleListDao) {
		this.sampleListDao = sampleListDao;
	}
	
	/**查询自己的抽样单的信息*/
	@Override
	public List<SampleList> findSampleListList() {
		List<SampleList> list = sampleListDao.findSampleListList();
		return list;
	}
	
	/**保存抽样单*/
	@Override
	public void saveSampleList(SampleList sampleList) {
		
		if(sampleList != null){
			long id = sampleList.getId();
			
			if(id == 0){
				sampleListDao.saveSampleList(sampleList);
			}else{
				sampleListDao.updateSampleList(sampleList);
			}
			
		}
		
		//获取抽样单ID
//		if(sampleList != null ){
//			long id = sampleList.getId();
//			/**新增保存*/
//			if(id==0){
//				//1：从Session中获取当前用户对象，将SampleList对象中user与Session中获取的用户对象进行关联
//				//sampleList.setuserId(SessionContext.get().getuserId());
//				sampleList.setUserName(SessionContext.get().getName());//建立管理关系
//				//2：保存抽样单表，添加一条数据
//				sampleListDao.saveSampleList(sampleList);
//			}
//		}
		/**更新保存*/
		//else{
			//1：执行update的操作，完成更新
			//sampleListDao.saveSampleList(sampleList);
		}
		
	//}
	
	/**使用抽样单ID，查询抽样单的对象*/
	@Override
	public SampleList findSampleListById(long id) {
		SampleList bill = sampleListDao.findSampleListById(id);
		return bill;
	}
	
	/**使用抽样单ID，删除抽样单*/
	@Override
	public void deleteSampleListById(long id) {
		sampleListDao.deleteSampleListById(id);
	}

	public ISampleListDao getSampleListDao() {
		return sampleListDao;
	}
}
