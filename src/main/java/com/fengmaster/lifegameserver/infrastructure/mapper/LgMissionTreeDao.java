package com.fengmaster.lifegameserver.infrastructure.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fengmaster.lifegameserver.domain.model.entity.LgMissionTree;
import org.apache.ibatis.annotations.Mapper;

/**
 * 任务树(LgMissionTree)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-31 10:44:30
 */
@Mapper
public interface LgMissionTreeDao extends BaseMapper<LgMissionTree> {

}