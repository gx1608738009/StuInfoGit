package dao;

import java.util.List;

import entity.StuInfo;

public interface StuInfoDao {
   //获得数据库中所有数据的方法
    List<StuInfo> getAll();
}
