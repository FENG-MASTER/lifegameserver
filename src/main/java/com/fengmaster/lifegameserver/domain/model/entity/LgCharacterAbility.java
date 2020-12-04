package com.fengmaster.lifegameserver.domain.model.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.util.Date;

/**
 * 角色能力(LgCharacterAbility)表实体类
 *
 * @author makejava
 * @since 2020-08-31 10:44:23
 */
@SuppressWarnings("serial")
public class LgCharacterAbility extends Model<LgCharacterAbility> {

    private String uuid;
    //等级
    private Integer level;
    //当前经验
    private Integer xp;

    private Date createTime;


    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getXp() {
        return xp;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
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