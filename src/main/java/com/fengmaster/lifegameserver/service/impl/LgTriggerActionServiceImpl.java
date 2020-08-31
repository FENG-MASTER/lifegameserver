package com.fengmaster.lifegameserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fengmaster.lifegameserver.dao.LgTriggerActionDao;
import com.fengmaster.lifegameserver.model.po.LgTriggerAction;
import com.fengmaster.lifegameserver.service.LgTriggerActionService;
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