package com.fengmaster.lifegameserver.domain.model;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

/**
 * (LgCharacterPermission)表实体类
 *
 * @author makejava
 * @since 2020-09-01 15:42:28
 */
@SuppressWarnings("serial")
@Data
public class LgCharacterPermission extends Model<LgCharacterPermission> {

    private String characterUuid;

    private String roleUuid;

    private String roleName;

    private String permissionUuid;

    private String permissionName;

    private String type;

    private String parameter;



}