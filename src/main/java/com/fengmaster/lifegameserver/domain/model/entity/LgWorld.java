package com.fengmaster.lifegameserver.domain.model.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * 游戏世界(LgWorld)表实体类
 *
 * @author makejava
 * @since 2020-08-31 10:44:36
 */
@SuppressWarnings("serial")
@Data
@Accessors(chain = true)
public class LgWorld extends Model<LgWorld> {

    private String uuid;
    //世界名称
    private String name;

    private String creatorCharacterUuid;
    //世界类型
    private String type;

    private Date createTime;

    public static final class TYPE{
        public static final String SINGLE="S";
        public static final String  MULTI="M";
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