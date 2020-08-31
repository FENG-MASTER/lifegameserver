package com.fengmaster.lifegameserver.model.po;

import com.baomidou.mybatisplus.extension.activerecord.Model;

/**
 * 对象所处世界表(LgObjWorld)表实体类
 *
 * @author makejava
 * @since 2020-08-31 10:44:31
 */
@SuppressWarnings("serial")
public class LgObjWorld extends Model<LgObjWorld> {

    private String worldUuid;

    private String objUuid;


    public String getWorldUuid() {
        return worldUuid;
    }

    public void setWorldUuid(String worldUuid) {
        this.worldUuid = worldUuid;
    }

    public String getObjUuid() {
        return objUuid;
    }

    public void setObjUuid(String objUuid) {
        this.objUuid = objUuid;
    }

}