package com.fengmaster.lifegameserver.infrastructure.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fengmaster.lifegameserver.domain.model.entity.LgTriggerCondition;
import org.apache.ibatis.annotations.Mapper;

/**
 * 触发器条件(LgTriggerCondition)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-31 10:44:33
 */
@Mapper
public interface LgTriggerConditionDao extends BaseMapper<LgTriggerCondition> {

}