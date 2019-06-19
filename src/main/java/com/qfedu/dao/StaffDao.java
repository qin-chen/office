package com.qfedu.dao;

import com.qfedu.pojo.Staff;

import java.util.List;

/**
 * Created by 星尘 on 2019/6/17.
 */
public interface StaffDao {
    public List<Staff> selectAll();

    void addStaff(Staff staff);

    void updateStaff(Staff staff);

    void delStaff(String no);

    Staff selectStaffByNo(String no);

    void addStaffBatch(List<Staff> staffList);
}
