package com.fengmaster.lifegameserver.infrastructure.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fengmaster.lifegameserver.infrastructure.mapper.LgMissionInstanceDao;
import com.fengmaster.lifegameserver.domain.model.entity.LgMissionInstance;
import com.fengmaster.lifegameserver.infrastructure.service.LgMissionInstanceService;
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