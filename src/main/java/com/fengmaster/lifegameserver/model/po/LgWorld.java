package com.fengmaster.lifegameserver.model.po;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * 游戏世界(LgWorld)表实体类
 *
 * @author makejava
 * @since 2020-08-31 10:44:36
 */
@SuppressWarnings("serial")
public class LgWorld extends Model<LgWorld> {

    private String uuid;
    //世界名称
    private String name;

    private String adminGamerList;
    //世界类型
    private String type;


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

    public String getAdminGamerList() {
        return adminGamerList;
    }

    public void setAdminGamerList(String adminGamerList) {
        this.adminGamerList = adminGamerList;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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