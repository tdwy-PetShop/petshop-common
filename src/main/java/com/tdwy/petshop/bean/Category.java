package com.tdwy.petshop.bean;

public class Category implements java.io.Serializable{
    private static final long serialVersionUID = 1L;
    private Integer id;

    private String cname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }
}