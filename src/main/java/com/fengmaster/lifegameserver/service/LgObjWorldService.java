package com.fengmaster.lifegameserver.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fengmaster.lifegameserver.model.po.LgObjWorld;

/**
 * 对象所处世界表(LgObjWorld)表服务接口
 *
 * @author makejava
 * @since 2020-08-31 10:44:31
 */
public interface LgObjWorldService extends IService<LgObjWorld> {

    /**
     * 添加到世界
     * @param objUuid
     * @param worldUuid
     */
    public void addObj2World(String objUuid,String worldUuid);

}