package com.qfedu.dao;

import com.qfedu.pojo.Depart;

import java.util.List;

/**
 * Created by 星尘 on 2019/6/17.
 */
public interface DepartDao {
    // public List<Depart> selectAll();
    public List<Depart> selectDepartName(); // 查询部门名字

    List<Depart> selectAllDepart();

    void updateDepart(Depart depart);

    void addDepart(Depart depart);

    void deleteDepart(Integer id);
}
