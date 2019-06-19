package com.qfedu.pojo;

import java.util.List;

/**
 * Created by Winchester on 2019/6/19.
 */
public class Authority {

    private Integer id;
    private String aicon;
    private String aurl;
    private Integer parentId;
    private String title;
    private Integer type;
    private List<Authority> authorityList;

    public List<Authority> getAuthorityList() {
        return authorityList;
    }

    public void setAuthorityList(List<Authority> authorityList) {
        this.authorityList = authorityList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAicon() {
        return aicon;
    }

    public void setAicon(String aicon) {
        this.aicon = aicon;
    }

    public String getAurl() {
        return aurl;
    }

    public void setAurl(String aurl) {
        this.aurl = aurl;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Authority{" +
                "id=" + id +
                ", aicon='" + aicon + '\'' +
                ", aurl='" + aurl + '\'' +
                ", parentId=" + parentId +
                ", title='" + title + '\'' +
                ", type=" + type +
                ", authorityList=" + authorityList +
                '}';
    }
}
