package com.newer.domain;

import java.sql.Timestamp;

public class TeaOrder {
    private Integer tid;
    private String detail;
    private Integer num;
    private Integer price;
    private Timestamp ordertime;

    public Integer getTid() {
        return tid;
    }

    public String getDetail() {
        return detail;
    }

    public Integer getNum() {
        return num;
    }

    public Integer getPrice() {
        return price;
    }

    public Timestamp getOrdertime() {
        return ordertime;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setOrdertime(Timestamp ordertime) {
        this.ordertime = ordertime;
    }
}
