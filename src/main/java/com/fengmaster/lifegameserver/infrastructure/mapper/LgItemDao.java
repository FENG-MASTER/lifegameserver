package com.fengmaster.lifegameserver.infrastructure.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fengmaster.lifegameserver.domain.model.entity.LgItem;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商店物品(LgItem)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-31 10:44:27
 */
@Mapper
public interface LgItemDao extends BaseMapper<LgItem> {

}