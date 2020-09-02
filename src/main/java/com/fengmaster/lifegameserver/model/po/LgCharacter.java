package com.fengmaster.lifegameserver.model.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 玩家(LgCharacter)表实体类
 *
 * @author makejava
 * @since 2020-08-31 10:44:21
 */
@SuppressWarnings("serial")
@Data
@Accessors(chain  = true)
public class LgCharacter extends Model<LgCharacter> {

    private String uuid;

    private String name;
    //头衔
    private String title;
    //介绍

    private String introduction;

    private Integer level;

    private Integer xp;
    //金币点数
    private Integer lifePoint;
    //所属用户UUID
    private String userUuid;


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