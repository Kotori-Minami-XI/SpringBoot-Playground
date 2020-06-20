package com.Kotori.domain;

import java.util.Date;

public class Hero {
    private Integer id;
    private String username;
    private String profession;
    private String phone;
    private String email;
    private Date onlinetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getOnlinetime() {
        return onlinetime;
    }

    public void setOnlinetime(Date onlinetime) {
        this.onlinetime = onlinetime;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", profession='" + profession + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", onlinetime=" + onlinetime +
                '}';
    }
}
