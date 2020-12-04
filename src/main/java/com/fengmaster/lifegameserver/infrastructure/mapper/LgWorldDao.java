package com.fengmaster.lifegameserver.infrastructure.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fengmaster.lifegameserver.domain.model.LgWorld;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 游戏世界(LgWorld)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-31 10:44:36
 */
@Mapper
public interface LgWorldDao extends BaseMapper<LgWorld> {


    public LgWorld getLastCreateWorldByCharacter(@Param("characterUuid") String characterUuid);
}