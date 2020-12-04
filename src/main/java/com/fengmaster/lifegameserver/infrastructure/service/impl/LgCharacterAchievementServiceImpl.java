package com.fengmaster.lifegameserver.infrastructure.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fengmaster.lifegameserver.infrastructure.mapper.LgCharacterAchievementDao;
import com.fengmaster.lifegameserver.domain.model.entity.LgCharacterAchievement;
import com.fengmaster.lifegameserver.infrastructure.service.LgCharacterAchievementService;
import org.springframework.stereotype.Service;

/**
 * 玩家成就(LgCharacterAchievement)表服务实现类
 *
 * @author makejava
 * @since 2020-08-31 10:44:25
 */
@Service("lgCharacterAchievementService")
public class LgCharacterAchievementServiceImpl extends ServiceImpl<LgCharacterAchievementDao, LgCharacterAchievement> implements LgCharacterAchievementService {

}