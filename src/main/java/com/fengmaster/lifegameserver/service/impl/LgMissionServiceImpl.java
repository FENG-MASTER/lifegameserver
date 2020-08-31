package com.fengmaster.lifegameserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fengmaster.lifegameserver.dao.LgMissionDao;
import com.fengmaster.lifegameserver.model.po.LgMission;
import com.fengmaster.lifegameserver.service.LgMissionService;
import org.springframework.stereotype.Service;

/**
 * 任务(LgMission)表服务实现类
 *
 * @author makejava
 * @since 2020-08-31 10:44:29
 */
@Service("lgMissionService")
public class LgMissionServiceImpl extends ServiceImpl<LgMissionDao, LgMission> implements LgMissionService {

}