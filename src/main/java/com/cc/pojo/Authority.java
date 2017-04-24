package com.cc.pojo;

import java.util.Date;

public class Authority {
    private Integer id;

    private String token;

    private Date expiration_date;

    private Integer privilege;

    @Override
    public String toString() {
        return "Authority{" +
                "id=" + id +
                ", token='" + token + '\'' +
                ", expirationDate=" + expiration_date +
                ", privilege=" + privilege +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getExpirationDate() {
        return expiration_date;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expiration_date = expirationDate;
    }

    public Integer getPrivilege() {
        return privilege;
    }

    public void setPrivilege(Integer privilege) {
        this.privilege = privilege;
    }
}