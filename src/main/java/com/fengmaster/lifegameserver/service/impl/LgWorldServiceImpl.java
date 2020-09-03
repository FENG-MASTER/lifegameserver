package com.fengmaster.lifegameserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fengmaster.lifegameserver.common.util.CommonUtil;
import com.fengmaster.lifegameserver.dao.LgWorldDao;
import com.fengmaster.lifegameserver.model.po.LgWorld;
import com.fengmaster.lifegameserver.service.LgObjWorldService;
import com.fengmaster.lifegameserver.service.LgWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 游戏世界(LgWorld)表服务实现类
 *
 * @author makejava
 * @since 2020-08-31 10:44:36
 */
@Service("lgWorldService")
public class LgWorldServiceImpl extends ServiceImpl<LgWorldDao, LgWorld> implements LgWorldService {

    @Autowired
    private LgWorldDao lgWorldDao;


    @Override
    public void createNewWorld(String name, String type,String characterUuid) {
        save(new LgWorld().setName(name).setType(type).setUuid(CommonUtil.randomUUID()).setCreatorCharacterUuid(characterUuid));

    }

    @Override
    public LgWorld getLastCreateWorldByCharacter(String characterUuid) {
        return lgWorldDao.getLastCreateWorldByCharacter(characterUuid);
    }
}