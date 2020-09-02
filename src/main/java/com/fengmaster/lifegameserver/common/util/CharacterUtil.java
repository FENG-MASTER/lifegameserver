package com.fengmaster.lifegameserver.common.util;

import cn.hutool.core.lang.UUID;
import com.fengmaster.lifegameserver.model.po.LgCharacter;

public class CharacterUtil {

    /**
     * 初始化角色信息
     */
    public static LgCharacter initCharacter(LgCharacter character){
        return character.setLevel(0).setLifePoint(0).setXp(0).setUuid(CommonUtil.randomUUID());
    }

}
