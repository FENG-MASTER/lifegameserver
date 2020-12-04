package com.fengmaster.lifegameserver.domain.model.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.util.Date;

/**
 * 能力(LgAbility)表实体类
 *
 * @author makejava
 * @since 2020-08-31 10:44:14
 */
@SuppressWarnings("serial")
public class LgAbility extends Model<LgAbility> {

    private String uuid;
    //能力名称
    private String name;
    //能力所属种类
    private String typeListUuid;
    //能力简介
    private String introduction;

    private Date createTime;


    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeListUuid() {
        return typeListUuid;
    }

    public void setTypeListUuid(String typeListUuid) {
        this.typeListUuid = typeListUuid;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.uuid;
    }
}