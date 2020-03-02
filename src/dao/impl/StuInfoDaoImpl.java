package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.StuInfoDao;
import entity.StuInfo;
import utils.BaseDao;

public class StuInfoDaoImpl implements StuInfoDao {
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	@Override
	public List<StuInfo> getAll() {
		List<StuInfo> list=new ArrayList<StuInfo>();
		try {
			conn=BaseDao.getConnection();
			String sql="select *from StuManagement";
			pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			while (rs.next()) {
				list.add(new StuInfo(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
