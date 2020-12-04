package com.fengmaster.lifegameserver.infrastructure.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fengmaster.lifegameserver.domain.model.entity.LgAbility;
import org.apache.ibatis.annotations.Mapper;

/**
 * 能力(LgAbility)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-31 10:44:18
 */
@Mapper
public interface LgAbilityDao extends BaseMapper<LgAbility> {

}