package com.fengmaster.lifegameserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fengmaster.lifegameserver.dao.LgAchievementDao;
import com.fengmaster.lifegameserver.model.po.LgAchievement;
import com.fengmaster.lifegameserver.service.LgAchievementService;
import org.springframework.stereotype.Service;

/**
 * 成就(LgAchievement)表服务实现类
 *
 * @author makejava
 * @since 2020-08-31 10:44:21
 */
@Service("lgAchievementService")
public class LgAchievementServiceImpl extends ServiceImpl<LgAchievementDao, LgAchievement> implements LgAchievementService {

}