package com.cn.xgfy.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Entity {
    /**
     * 主键自增
     */
    private Integer id;

    /**
     * 日期
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date time;

    /**
     * 新增确诊
     */
    private Integer newdiagnosed;

    /**
     * 新增死亡
     */
    private Integer newdeath;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getNewdiagnosed() {
        return newdiagnosed;
    }

    public void setNewdiagnosed(Integer newdiagnosed) {
        this.newdiagnosed = newdiagnosed;
    }

    public Integer getNewdeath() {
        return newdeath;
    }

    public void setNewdeath(Integer newdeath) {
        this.newdeath = newdeath;
    }
}