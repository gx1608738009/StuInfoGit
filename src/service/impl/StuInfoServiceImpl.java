package service.impl;

import java.util.List;

import dao.StuInfoDao;
import dao.impl.StuInfoDaoImpl;
import entity.StuInfo;
import service.StuInfoService;

public class StuInfoServiceImpl implements StuInfoService {
    //����һ���ӿڵ�ʵ�������
	private StuInfoDao sdao=new StuInfoDaoImpl();
	@Override
	public List<StuInfo> getAll() {
		// TODO Auto-generated method stub
		return sdao.getAll();
	}

}
