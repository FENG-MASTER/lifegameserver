package com.fengmaster.lifegameserver.domain.model.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 用户权限(LgUserPermission)表实体类
 *
 * @author makejava
 * @since 2020-09-03 10:17:59
 */
@SuppressWarnings("serial")
@Data
@Accessors(chain = true)
public class LgUserPermission extends Model<LgUserPermission> {

    private String userUuid;

    private String permissionUuid;

    private String parameter;


}