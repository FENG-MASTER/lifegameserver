package com.fengmaster.lifegameserver.domain.model.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.util.Date;

/**
 * 玩家成就(LgCharacterAchievement)表实体类
 *
 * @author makejava
 * @since 2020-08-31 10:44:24
 */
@SuppressWarnings("serial")
public class LgCharacterAchievement extends Model<LgCharacterAchievement> {

    private String uuid;

    private String name;
    //成就原UUID
    private String achievementUuid;

    private String typeListUuid;

    private String introduction;
    //获得时间
    private Date gainTime;


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

    public String getAchievementUuid() {
        return achievementUuid;
    }

    public void setAchievementUuid(String achievementUuid) {
        this.achievementUuid = achievementUuid;
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

    public Date getGainTime() {
        return gainTime;
    }

    public void setGainTime(Date gainTime) {
        this.gainTime = gainTime;
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