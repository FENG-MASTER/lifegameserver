package com.fengmaster.lifegameserver.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fengmaster.lifegameserver.model.po.LgTrigger;
import org.apache.ibatis.annotations.Mapper;

/**
 * 触发器(LgTrigger)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-31 10:44:32
 */
@Mapper
public interface LgTriggerDao extends BaseMapper<LgTrigger> {

}