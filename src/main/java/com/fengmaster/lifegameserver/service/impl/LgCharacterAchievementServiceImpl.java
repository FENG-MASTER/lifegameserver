package com.fengmaster.lifegameserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fengmaster.lifegameserver.dao.LgCharacterAchievementDao;
import com.fengmaster.lifegameserver.model.po.LgCharacterAchievement;
import com.fengmaster.lifegameserver.service.LgCharacterAchievementService;
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