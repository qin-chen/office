package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.StaffDao;
import com.qfedu.pojo.Staff;
import com.qfedu.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 星尘 on 2019/6/17.
 */
@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    private StaffDao staffDao;

    @Override
    public Map<String, Object> selectAll(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<Staff> staffList = staffDao.selectAll();
        long total = ((Page) staffList).getTotal(); // 获取总记录数
        int pages = ((Page) staffList).getPages(); // 获取总页数
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", total);
        map.put("data", staffList);
        return map;
    }

    @Override
    public void addStaff(Staff staff) {
        staffDao.addStaff(staff);
    }

    @Override
    public void updateStaff(Staff staff) {
        staffDao.updateStaff(staff);
    }

    @Override
    public void delStaff(String no) {
        staffDao.delStaff(no);
    }

    @Override
    public Staff selectStaffByNo(String no) {
        return staffDao.selectStaffByNo(no);
    }
}