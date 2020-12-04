package com.fengmaster.lifegameserver.infrastructure.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fengmaster.lifegameserver.domain.model.LgCharacterAchievement;
import org.apache.ibatis.annotations.Mapper;

/**
 * 玩家成就(LgCharacterAchievement)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-31 10:44:25
 */
@Mapper
public interface LgCharacterAchievementDao extends BaseMapper<LgCharacterAchievement> {

}