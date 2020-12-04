package com.fengmaster.lifegameserver.infrastructure.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fengmaster.lifegameserver.domain.model.entity.LgUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * 玩家(LgUser)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-31 10:44:35
 */
@Mapper
public interface LgUserDao extends BaseMapper<LgUser> {

}