package com.fengmaster.lifegameserver.model.po;

import com.baomidou.mybatisplus.extension.activerecord.Model;

/**
 * 分类列表(LgTypeList)表实体类
 *
 * @author makejava
 * @since 2020-08-31 10:44:34
 */
@SuppressWarnings("serial")
public class LgTypeList extends Model<LgTypeList> {
    //列表UUID
    private String listUuid;

    private String type;


    public String getListUuid() {
        return listUuid;
    }

    public void setListUuid(String listUuid) {
        this.listUuid = listUuid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}