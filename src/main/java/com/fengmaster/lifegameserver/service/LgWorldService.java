package com.fengmaster.lifegameserver.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fengmaster.lifegameserver.model.po.LgWorld;

/**
 * 游戏世界(LgWorld)表服务接口
 *
 * @author makejava
 * @since 2020-08-31 10:44:36
 */
public interface LgWorldService extends IService<LgWorld> {

    /**
     * 创造一个世界
     * @param name 世界名称
     * @param type 种类
     * @param characterUuid 造物主角色UUID
     */
    public void createNewWorld(String name,String type,String characterUuid);

    /**
     * 查询角色最后创建的世界
     * @param characterUuid
     */
    public LgWorld getLastCreateWorldByCharacter(String characterUuid);

}