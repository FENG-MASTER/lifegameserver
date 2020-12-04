package com.fengmaster.lifegameserver.domain.model;

import com.baomidou.mybatisplus.extension.activerecord.Model;

/**
 * 任务树(LgMissionTree)表实体类
 *
 * @author makejava
 * @since 2020-08-31 10:44:30
 */
@SuppressWarnings("serial")
public class LgMissionTree extends Model<LgMissionTree> {
    //任务UUID
    private String parentMissionUuid;
    //子任务UUID
    private Integer subMissionUuid;


    public String getParentMissionUuid() {
        return parentMissionUuid;
    }

    public void setParentMissionUuid(String parentMissionUuid) {
        this.parentMissionUuid = parentMissionUuid;
    }

    public Integer getSubMissionUuid() {
        return subMissionUuid;
    }

    public void setSubMissionUuid(Integer subMissionUuid) {
        this.subMissionUuid = subMissionUuid;
    }

}