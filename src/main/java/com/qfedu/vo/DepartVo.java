package com.qfedu.vo;

import com.qfedu.pojo.Depart;

/**
 * Created by 星尘 on 2019/6/19.
 */
public class DepartVo extends Depart {
    private Integer did;
    private Integer dcount;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getDcount() {
        return dcount;
    }

    public void setDcount(Integer dcount) {
        this.dcount = dcount;
    }
}