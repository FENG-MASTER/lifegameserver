package com.fengmaster.lifegameserver.domain.model.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;

/**
 * 玩家拥有的对象(LgCharacterOwner)表实体类
 *
 * @author makejava
 * @since 2020-08-31 10:44:26
 */
@SuppressWarnings("serial")
public class LgCharacterOwner extends Model<LgCharacterOwner> {

    private String characterUuid;

    private String objUuid;


    public String getCharacterUuid() {
        return characterUuid;
    }

    public void setCharacterUuid(String characterUuid) {
        this.characterUuid = characterUuid;
    }

    public String getObjUuid() {
        return objUuid;
    }

    public void setObjUuid(String objUuid) {
        this.objUuid = objUuid;
    }

}