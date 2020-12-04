package com.fengmaster.lifegameserver.infrastructure.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fengmaster.lifegameserver.infrastructure.mapper.LgMissionTreeDao;
import com.fengmaster.lifegameserver.domain.model.entity.LgMissionTree;
import com.fengmaster.lifegameserver.infrastructure.service.LgMissionTreeService;
import org.springframework.stereotype.Service;

/**
 * 任务树(LgMissionTree)表服务实现类
 *
 * @author makejava
 * @since 2020-08-31 10:44:30
 */
@Service("lgMissionTreeService")
public class LgMissionTreeServiceImpl extends ServiceImpl<LgMissionTreeDao, LgMissionTree> implements LgMissionTreeService {

}