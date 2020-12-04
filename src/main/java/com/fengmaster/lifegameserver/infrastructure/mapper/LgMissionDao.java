package com.fengmaster.lifegameserver.infrastructure.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fengmaster.lifegameserver.domain.model.LgMission;
import org.apache.ibatis.annotations.Mapper;

/**
 * 任务(LgMission)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-31 10:44:28
 */
@Mapper
public interface LgMissionDao extends BaseMapper<LgMission> {

}