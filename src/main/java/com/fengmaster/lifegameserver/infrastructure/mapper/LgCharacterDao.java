package com.fengmaster.lifegameserver.infrastructure.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fengmaster.lifegameserver.domain.model.LgCharacter;
import org.apache.ibatis.annotations.Mapper;

/**
 * 玩家(LgCharacter)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-31 10:44:22
 */
@Mapper
public interface LgCharacterDao extends BaseMapper<LgCharacter> {

}