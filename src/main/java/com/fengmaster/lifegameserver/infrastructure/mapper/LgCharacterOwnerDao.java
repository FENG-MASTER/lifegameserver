package com.fengmaster.lifegameserver.infrastructure.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fengmaster.lifegameserver.domain.model.entity.LgCharacterOwner;
import org.apache.ibatis.annotations.Mapper;

/**
 * 玩家拥有的对象(LgCharacterOwner)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-31 10:44:26
 */
@Mapper
public interface LgCharacterOwnerDao extends BaseMapper<LgCharacterOwner> {

}