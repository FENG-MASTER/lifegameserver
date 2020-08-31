package com.fengmaster.lifegameserver.model.po;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * 任务(LgMission)表实体类
 *
 * @author makejava
 * @since 2020-08-31 10:44:28
 */
@SuppressWarnings("serial")
public class LgMission extends Model<LgMission> {

    private String uuid;
    //任务名
    private String name;
    //任务描述
    private String desc;
    //任务类型列表UUID
    private String typeListUuid;
    //综合难度
    private Integer difficulty;
    //任务重复类型
    private Integer repeatType;
    //重复的间隔时间(根据类型不同表示的单位不同)

    private Integer repeatInterval;
    //可重复次数
    private Integer repeatAvailableTime;
    //任务过期后是否自动失败
    private Object autoFail;


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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTypeListUuid() {
        return typeListUuid;
    }

    public void setTypeListUuid(String typeListUuid) {
        this.typeListUuid = typeListUuid;
    }

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    public Integer getRepeatType() {
        return repeatType;
    }

    public void setRepeatType(Integer repeatType) {
        this.repeatType = repeatType;
    }

    public Integer getRepeatInterval() {
        return repeatInterval;
    }

    public void setRepeatInterval(Integer repeatInterval) {
        this.repeatInterval = repeatInterval;
    }

    public Integer getRepeatAvailableTime() {
        return repeatAvailableTime;
    }

    public void setRepeatAvailableTime(Integer repeatAvailableTime) {
        this.repeatAvailableTime = repeatAvailableTime;
    }

    public Object getAutoFail() {
        return autoFail;
    }

    public void setAutoFail(Object autoFail) {
        this.autoFail = autoFail;
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