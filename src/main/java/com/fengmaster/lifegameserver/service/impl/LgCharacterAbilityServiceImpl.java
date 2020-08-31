package com.fengmaster.lifegameserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fengmaster.lifegameserver.dao.LgCharacterAbilityDao;
import com.fengmaster.lifegameserver.model.po.LgCharacterAbility;
import com.fengmaster.lifegameserver.service.LgCharacterAbilityService;
import org.springframework.stereotype.Service;

/**
 * 角色能力(LgCharacterAbility)表服务实现类
 *
 * @author makejava
 * @since 2020-08-31 10:44:24
 */
@Service("lgCharacterAbilityService")
public class LgCharacterAbilityServiceImpl extends ServiceImpl<LgCharacterAbilityDao, LgCharacterAbility> implements LgCharacterAbilityService {

}