package com.fengmaster.lifegameserver.service.impl;

import cn.hutool.core.lang.UUID;
import cn.hutool.crypto.SecureUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fengmaster.lifegameserver.dao.LgUserDao;
import com.fengmaster.lifegameserver.model.po.LgUser;
import com.fengmaster.lifegameserver.service.LgUserService;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * 玩家(LgUser)表服务实现类
 *
 * @author makejava
 * @since 2020-08-31 10:44:35
 */
@Service("lgUserService")
@Validated
public class LgUserServiceImpl extends ServiceImpl<LgUserDao, LgUser> implements LgUserService {


    /**
     * 玩家注冊
     * @return
     */
    @Override
    public boolean register(@Valid LgUser lgUser){
        //生成UUID
        lgUser.setUuid(UUID.randomUUID().toString(true));
        //sha256加密密码
        lgUser.setPassword(SecureUtil.sha256(lgUser.getPassword()));
        return save(lgUser);
    }


}