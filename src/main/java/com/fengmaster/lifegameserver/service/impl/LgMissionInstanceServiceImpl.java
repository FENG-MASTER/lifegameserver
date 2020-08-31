package com.fengmaster.lifegameserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fengmaster.lifegameserver.dao.LgMissionInstanceDao;
import com.fengmaster.lifegameserver.model.po.LgMissionInstance;
import com.fengmaster.lifegameserver.service.LgMissionInstanceService;
import org.springframework.stereotype.Service;

/**
 * 进行中的任务实例(LgMissionInstance)表服务实现类
 *
 * @author makejava
 * @since 2020-08-31 10:44:29
 */
@Service("lgMissionInstanceService")
public class LgMissionInstanceServiceImpl extends ServiceImpl<LgMissionInstanceDao, LgMissionInstance> implements LgMissionInstanceService {

}