package com.fengmaster.lifegameserver.model.po;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * 触发器动作(LgTriggerAction)表实体类
 *
 * @author makejava
 * @since 2020-08-31 10:44:32
 */
@SuppressWarnings("serial")
public class LgTriggerAction extends Model<LgTriggerAction> {

    private String uuid;

    private String name;
    //触发器动作class
    private String actionClass;

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

    public String getActionClass() {
        return actionClass;
    }

    public void setActionClass(String actionClass) {
        this.actionClass = actionClass;
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