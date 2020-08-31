package com.fengmaster.lifegameserver.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fengmaster.lifegameserver.model.po.LgCharacterAbility;
import org.apache.ibatis.annotations.Mapper;

/**
 * 角色能力(LgCharacterAbility)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-31 10:44:24
 */
@Mapper
public interface LgCharacterAbilityDao extends BaseMapper<LgCharacterAbility> {

}