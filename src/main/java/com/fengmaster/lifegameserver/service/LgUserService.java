package com.fengmaster.lifegameserver.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fengmaster.lifegameserver.model.po.LgUser;

/**
 * 玩家(LgUser)表服务接口
 *
 * @author makejava
 * @since 2020-08-31 10:44:35
 */
public interface LgUserService extends IService<LgUser> {

    public boolean register(LgUser lgUser);

}