package com.fengmaster.lifegameserver.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fengmaster.lifegameserver.model.po.LgTypeList;
import org.apache.ibatis.annotations.Mapper;

/**
 * 分类列表(LgTypeList)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-31 10:44:34
 */
@Mapper
public interface LgTypeListDao extends BaseMapper<LgTypeList> {

}