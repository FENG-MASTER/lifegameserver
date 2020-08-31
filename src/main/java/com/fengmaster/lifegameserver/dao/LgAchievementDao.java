package com.fengmaster.lifegameserver.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fengmaster.lifegameserver.model.po.LgAchievement;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成就(LgAchievement)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-31 10:44:21
 */
@Mapper
public interface LgAchievementDao extends BaseMapper<LgAchievement> {

}