package com.qfedu.service;

import com.qfedu.pojo.Depart;
import com.qfedu.pojo.Staff;

import java.util.List;
import java.util.Map;

/**
 * Created by 星尘 on 2019/6/17.
 */
public interface DepartService {
    public List<Depart> selectDepartName(); // 查询部门名字

    Map<String,Object> selectAll(Integer page, Integer limit);

    void updateDepart(Depart depart);

    void addDepart(Depart depart);

    void deleteDepart(Integer id);
}
