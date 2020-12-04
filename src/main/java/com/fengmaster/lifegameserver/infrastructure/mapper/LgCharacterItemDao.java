package com.fengmaster.lifegameserver.infrastructure.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fengmaster.lifegameserver.domain.model.LgCharacterItem;
import org.apache.ibatis.annotations.Mapper;

/**
 * 玩家获得的物品(LgCharacterItem)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-31 10:44:25
 */
@Mapper
public interface LgCharacterItemDao extends BaseMapper<LgCharacterItem> {

}