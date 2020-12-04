package com.fengmaster.lifegameserver.infrastructure.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fengmaster.lifegameserver.infrastructure.mapper.LgTypeListDao;
import com.fengmaster.lifegameserver.domain.model.LgTypeList;
import com.fengmaster.lifegameserver.infrastructure.service.LgTypeListService;
import org.springframework.stereotype.Service;

/**
 * 分类列表(LgTypeList)表服务实现类
 *
 * @author makejava
 * @since 2020-08-31 10:44:34
 */
@Service("lgTypeListService")
public class LgTypeListServiceImpl extends ServiceImpl<LgTypeListDao, LgTypeList> implements LgTypeListService {

}