package com.fengmaster.lifegameserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fengmaster.lifegameserver.dao.LgMissionTreeDao;
import com.fengmaster.lifegameserver.model.po.LgMissionTree;
import com.fengmaster.lifegameserver.service.LgMissionTreeService;
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