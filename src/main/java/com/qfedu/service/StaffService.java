package com.qfedu.service;

import com.qfedu.pojo.Staff;

import java.util.List;
import java.util.Map;

/**
 * Created by 星尘 on 2019/6/17.
 */
public interface StaffService {
    public Map <String ,Object> selectAll (Integer page,Integer limit); // 分页展示

    void addStaff(Staff staff);  // 添加员工

    void updateStaff(Staff staff); // 更新手机

    void delStaff(String no);

    Staff selectStaffByNo(String no);

    void addStaffBatch(List<Staff> staffList);
}
