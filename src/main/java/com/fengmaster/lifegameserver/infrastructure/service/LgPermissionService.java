package com.fengmaster.lifegameserver.infrastructure.service;

import com.fengmaster.lifegameserver.domain.model.entity.LgCharacterPermission;
import com.fengmaster.lifegameserver.domain.model.entity.LgUserPermission;

import java.util.List;

/**
 * (LgCharacterPermission)表服务接口
 *
 * @author makejava
 * @since 2020-09-03 10:05:38
 */
public interface LgPermissionService  {

    /**
     * 获取所有用户权限
     * @param userUuid 用户UUID
     * @return
     */
    public List<LgUserPermission> getAllUserPermission(String userUuid);

    /**
     * 根据用户UUID获取所有角色权限
     * @param userUuid 用户UUID
     * @return
     */
    public List<LgCharacterPermission> getAllCharacterPermissionByUserUuid(String userUuid);


    /**
     * 初始化新角色的权限
     * @param characterUuid
     */
    public void initCharacterPermission(String characterUuid);
}