package com.fengmaster.lifegameserver.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fengmaster.lifegameserver.model.po.LgWorld;
import org.apache.ibatis.annotations.Mapper;

/**
 * 游戏世界(LgWorld)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-31 10:44:36
 */
@Mapper
public interface LgWorldDao extends BaseMapper<LgWorld> {

}