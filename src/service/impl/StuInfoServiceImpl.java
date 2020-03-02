package service.impl;

import java.util.List;

import dao.StuInfoDao;
import dao.impl.StuInfoDaoImpl;
import entity.StuInfo;
import service.StuInfoService;

public class StuInfoServiceImpl implements StuInfoService {
    //创建一个接口的实现类对象
	private StuInfoDao sdao=new StuInfoDaoImpl();
	@Override
	public List<StuInfo> getAll() {
		// TODO Auto-generated method stub
		return sdao.getAll();
	}

}
