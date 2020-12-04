package com.fengmaster.lifegameserver.infrastructure.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fengmaster.lifegameserver.infrastructure.mapper.LgObjWorldDao;
import com.fengmaster.lifegameserver.domain.model.entity.LgObjWorld;
import com.fengmaster.lifegameserver.infrastructure.service.LgObjWorldService;
import org.springframework.stereotype.Service;

/**
 * 对象所处世界表(LgObjWorld)表服务实现类
 *
 * @author makejava
 * @since 2020-08-31 10:44:31
 */
@Service("lgObjWorldService")
class LgObjWorldServiceImpl extends ServiceImpl<LgObjWorldDao, LgObjWorld> implements LgObjWorldService {

    @Override
    public void addObj2World(String objUuid, String worldUuid) {
        save(new LgObjWorld().setObjUuid(objUuid).setWorldUuid(worldUuid));
    }
}