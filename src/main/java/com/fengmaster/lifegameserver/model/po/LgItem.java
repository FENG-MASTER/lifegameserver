package com.fengmaster.lifegameserver.model.po;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * 商店物品(LgItem)表实体类
 *
 * @author makejava
 * @since 2020-08-31 10:44:27
 */
@SuppressWarnings("serial")
public class LgItem extends Model<LgItem> {

    private String uuid;
    //物品名称
    private String name;
    //物品种类列表UUID
    private String typeListUuid;
    //详细描述信息

    private String introduction;
    //物品价格
    private Integer price;
    //剩余数量
    private Integer quantity;
    //是否消耗品
    private Object expendable;


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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Object getExpendable() {
        return expendable;
    }

    public void setExpendable(Object expendable) {
        this.expendable = expendable;
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