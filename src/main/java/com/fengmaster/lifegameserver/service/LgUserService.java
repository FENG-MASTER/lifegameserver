package com.fengmaster.lifegameserver.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fengmaster.lifegameserver.model.po.LgUser;

import javax.validation.Valid;

/**
 * 玩家(LgUser)表服务接口
 *
 * @author makejava
 * @since 2020-08-31 10:44:35
 */
public interface LgUserService extends IService<LgUser> {

    public boolean register(@Valid LgUser lgUser);

    /**
     * 登录
     * @param userName
     * @param password
     */
    public void login(String userName,String password);

    /**
     * 根据登录名获取用户信息
     * @param userName
     * @return
     */
    public LgUser getUserByUserName(String userName);

}