package com.fengmaster.lifegameserver.infrastructure.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fengmaster.lifegameserver.infrastructure.mapper.LgTriggerActionDao;
import com.fengmaster.lifegameserver.domain.model.LgTriggerAction;
import com.fengmaster.lifegameserver.infrastructure.service.LgTriggerActionService;
import org.springframework.stereotype.Service;

/**
 * 触发器动作(LgTriggerAction)表服务实现类
 *
 * @author makejava
 * @since 2020-08-31 10:44:33
 */
@Service("lgTriggerActionService")
public class LgTriggerActionServiceImpl extends ServiceImpl<LgTriggerActionDao, LgTriggerAction> implements LgTriggerActionService {

}