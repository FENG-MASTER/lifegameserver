package com.fengmaster.lifegameserver.infrastructure.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fengmaster.lifegameserver.infrastructure.mapper.LgAbilityDao;
import com.fengmaster.lifegameserver.domain.model.entity.LgAbility;
import com.fengmaster.lifegameserver.infrastructure.service.LgAbilityService;
import org.springframework.stereotype.Service;

/**
 * 能力(LgAbility)表服务实现类
 *
 * @author makejava
 * @since 2020-08-31 10:44:20
 */
@Service("lgAbilityService")
public class LgAbilityServiceImpl extends ServiceImpl<LgAbilityDao, LgAbility> implements LgAbilityService {

}