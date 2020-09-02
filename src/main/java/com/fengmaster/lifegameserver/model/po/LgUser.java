package com.fengmaster.lifegameserver.model.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 玩家(LgUser)表实体类
 *
 * @author makejava
 * @since 2020-08-31 10:44:35
 */
@SuppressWarnings("serial")
@Data
@Accessors(chain  = true)
public class LgUser extends Model<LgUser> {

    /**
     * 性别枚举
     */
    public static enum SEX{

        /**
         * 男
         */
        M("M","男性"),
        F("F","女性");

        String value;
        String desc;

        SEX(String value, String desc) {
            this.value = value;
            this.desc = desc;
        }

        SEX(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }


    private String uuid;
    //登录名
    /**
     *
     */
    @NotNull(message = "登录名不可空")
    @NotBlank(message = "登录名不可空")
    @Schema(description = "登录名")
    private String name;
    //昵称
    /**
     *
     */
    @NotBlank(message = "昵称不可空")
    @NotNull(message = "昵称不可空")
    @Schema(description = "昵称")
    private String nickName;
    //M:男 F:女
    private SEX sex;

    @NotBlank(message = "密码不可空")
    @NotNull(message = "密码不可空")
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