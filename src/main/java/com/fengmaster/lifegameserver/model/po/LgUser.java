package com.fengmaster.lifegameserver.model.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * 玩家(LgUser)表实体类
 *
 * @author makejava
 * @since 2020-08-31 10:44:35
 */
@SuppressWarnings("serial")
@Data
@TableName("LG_USER")
public class LgUser extends Model<LgUser> {

    private String uuid;
    //登录名
    private String name;
    //昵称
    private String nickName;
    //M:男 F:女
    private String sex;

    private String password;



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