package com.fengmaster.lifegameserver.infrastructure.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fengmaster.lifegameserver.domain.model.LgCharacterPermission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (LgCharacterPermission)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-01 15:42:30
 */
@Mapper
public interface LgCharacterPermissionDao extends BaseMapper<LgCharacterPermission> {

    /**
     *  根据用户UUID获取所有角色权限
     * @param userUuid
     * @return
     */
    public List<LgCharacterPermission> getAllCharacterPermissionByUserUuid(@Param("userUuid") String userUuid);
}