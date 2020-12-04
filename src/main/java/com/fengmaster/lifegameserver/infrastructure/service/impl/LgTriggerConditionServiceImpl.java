package com.fengmaster.lifegameserver.infrastructure.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fengmaster.lifegameserver.infrastructure.mapper.LgTriggerConditionDao;
import com.fengmaster.lifegameserver.domain.model.LgTriggerCondition;
import com.fengmaster.lifegameserver.infrastructure.service.LgTriggerConditionService;
import org.springframework.stereotype.Service;

/**
 * 触发器条件(LgTriggerCondition)表服务实现类
 *
 * @author makejava
 * @since 2020-08-31 10:44:34
 */
@Service("lgTriggerConditionService")
public class LgTriggerConditionServiceImpl extends ServiceImpl<LgTriggerConditionDao, LgTriggerCondition> implements LgTriggerConditionService {

}