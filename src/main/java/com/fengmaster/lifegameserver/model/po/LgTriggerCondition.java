package com.fengmaster.lifegameserver.model.po;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * 触发器条件(LgTriggerCondition)表实体类
 *
 * @author makejava
 * @since 2020-08-31 10:44:33
 */
@SuppressWarnings("serial")
public class LgTriggerCondition extends Model<LgTriggerCondition> {

    private String uuid;
    //触发条件名称
    private String name;
    //对应触发器的class
    private String conditionClass;
    //触发条件说明
    private String desc;


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

    public String getConditionClass() {
        return conditionClass;
    }

    public void setConditionClass(String conditionClass) {
        this.conditionClass = conditionClass;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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