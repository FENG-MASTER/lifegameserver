package com.fengmaster.lifegameserver.infrastructure.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fengmaster.lifegameserver.infrastructure.mapper.LgTriggerDao;
import com.fengmaster.lifegameserver.domain.model.entity.LgTrigger;
import com.fengmaster.lifegameserver.infrastructure.service.LgTriggerService;
import org.springframework.stereotype.Service;

/**
 * 触发器(LgTrigger)表服务实现类
 *
 * @author makejava
 * @since 2020-08-31 10:44:32
 */
@Service("lgTriggerService")
public class LgTriggerServiceImpl extends ServiceImpl<LgTriggerDao, LgTrigger> implements LgTriggerService {

}