package com.qfedu.pojo;

import java.util.List;

/**
 * Created by 星尘 on 2019/6/20.
 */
public class Role {
    private Integer id;
    private  String info;
    private  String name;
    private List<Integer> aids;

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", info='" + info + '\'' +
                ", name='" + name + '\'' +
                ", aids=" + aids +
                '}';
    }

    public List<Integer> getAids() {
        return aids;
    }

    public void setAids(List<Integer> aids) {
        this.aids = aids;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}