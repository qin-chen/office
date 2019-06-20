package com.qfedu.pojo;

/**
 * Created by Winchester on 2019/6/19.
 */
public class LoginLog {

    private Integer id;
    private String ip;
    private String no;
    private String createtime;
    private String location;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "LoginLog{" +
                "id=" + id +
                ", ip='" + ip + '\'' +
                ", no='" + no + '\'' +
                ", createtime='" + createtime + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
