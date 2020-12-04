package com.fengmaster.lifegameserver.infrastructure.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fengmaster.lifegameserver.domain.model.LgUserPermission;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户权限(LgUserPermission)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-03 10:17:59
 */
@Mapper
public interface LgUserPermissionDao extends BaseMapper<LgUserPermission> {

}