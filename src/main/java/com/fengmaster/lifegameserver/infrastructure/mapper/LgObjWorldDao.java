package com.fengmaster.lifegameserver.infrastructure.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fengmaster.lifegameserver.domain.model.entity.LgObjWorld;
import org.apache.ibatis.annotations.Mapper;

/**
 * 对象所处世界表(LgObjWorld)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-31 10:44:31
 */
@Mapper
public interface LgObjWorldDao extends BaseMapper<LgObjWorld> {

}