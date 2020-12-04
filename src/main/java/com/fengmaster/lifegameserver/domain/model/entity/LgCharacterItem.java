package com.fengmaster.lifegameserver.domain.model.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.util.Date;

/**
 * 玩家获得的物品(LgCharacterItem)表实体类
 *
 * @author makejava
 * @since 2020-08-31 10:44:25
 */
@SuppressWarnings("serial")
public class LgCharacterItem extends Model<LgCharacterItem> {

    private String uuid;
    //所属物品ID
    private String itemUuid;
    //种类
    private String typeListUuid;

    private String name;

    private String introduction;
    //获得时间
    private Date gainTime;
    //是否已经使用
    private Object used;


    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getItemUuid() {
        return itemUuid;
    }

    public void setItemUuid(String itemUuid) {
        this.itemUuid = itemUuid;
    }

    public String getTypeListUuid() {
        return typeListUuid;
    }

    public void setTypeListUuid(String typeListUuid) {
        this.typeListUuid = typeListUuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Object getUsed() {
        return used;
    }

    public void setUsed(Object used) {
        this.used = used;
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