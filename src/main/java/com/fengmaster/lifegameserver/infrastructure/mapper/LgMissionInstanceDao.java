package com.fengmaster.lifegameserver.infrastructure.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fengmaster.lifegameserver.domain.model.entity.LgMissionInstance;
import org.apache.ibatis.annotations.Mapper;

/**
 * 进行中的任务实例(LgMissionInstance)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-31 10:44:29
 */
@Mapper
public interface LgMissionInstanceDao extends BaseMapper<LgMissionInstance> {

}