package com.fengmaster.lifegameserver.domain.model;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.util.Date;

/**
 * 触发器(LgTrigger)表实体类
 *
 * @author makejava
 * @since 2020-08-31 10:44:31
 */
@SuppressWarnings("serial")
public class LgTrigger extends Model<LgTrigger> {

    private String uuid;
    // 主体对象UUID
    private String mainObjUuid;
    //触发条件UUID
    private String conditionUuid;
    //触发条件参数
    private String conditionParameter;
    //触发条件存储信息
    private String conditionSaveInfo;
    //触发动作UUID
    private String actionUuid;
    //触发动作参数
    private String actionParameter;
    //触发动作存储信息
    private String actionSaveInfo;

    private Date createTime;


    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getMainObjUuid() {
        return mainObjUuid;
    }

    public void setMainObjUuid(String mainObjUuid) {
        this.mainObjUuid = mainObjUuid;
    }

    public String getConditionUuid() {
        return conditionUuid;
    }

    public void setConditionUuid(String conditionUuid) {
        this.conditionUuid = conditionUuid;
    }

    public String getConditionParameter() {
        return conditionParameter;
    }

    public void setConditionParameter(String conditionParameter) {
        this.conditionParameter = conditionParameter;
    }

    public String getConditionSaveInfo() {
        return conditionSaveInfo;
    }

    public void setConditionSaveInfo(String conditionSaveInfo) {
        this.conditionSaveInfo = conditionSaveInfo;
    }

    public String getActionUuid() {
        return actionUuid;
    }

    public void setActionUuid(String actionUuid) {
        this.actionUuid = actionUuid;
    }

    public String getActionParameter() {
        return actionParameter;
    }

    public void setActionParameter(String actionParameter) {
        this.actionParameter = actionParameter;
    }

    public String getActionSaveInfo() {
        return actionSaveInfo;
    }

    public void setActionSaveInfo(String actionSaveInfo) {
        this.actionSaveInfo = actionSaveInfo;
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