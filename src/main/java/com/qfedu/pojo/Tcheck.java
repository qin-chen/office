package com.qfedu.pojo;

/**
 * Created by Administrator on 2019/6/17 0017.
 */
public class Tcheck {
    private Integer id;
    private String info;
    private String type;
    private String startname;
    private String startno;
    private String startDate;
    private String endDate;
    private Integer days;
    private String pid;
    private Integer flag;
    private Staff staff;

    @Override
    public String toString() {
        return "Tcheck{" +
                "id=" + id +
                ", info='" + info + '\'' +
                ", type='" + type + '\'' +
                ", startname='" + startname + '\'' +
                ", startno='" + startno + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", days=" + days +
                ", pid='" + pid + '\'' +
                ", flag=" + flag +
                ", staff=" + staff +
                '}';
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStartname() {
        return startname;
    }

    public void setStartname(String startname) {
        this.startname = startname;
    }

    public String getStartno() {
        return startno;
    }

    public void setStartno(String startno) {
        this.startno = startno;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }
}