package com.fengmaster.lifegameserver.service.impl;

import cn.hutool.core.lang.UUID;
import cn.hutool.crypto.SecureUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fengmaster.lifegameserver.common.BusinessException;
import com.fengmaster.lifegameserver.common.util.CommonUtil;
import com.fengmaster.lifegameserver.common.util.UserUtil;
import com.fengmaster.lifegameserver.dao.LgUserDao;
import com.fengmaster.lifegameserver.model.po.LgUser;
import com.fengmaster.lifegameserver.model.po.LgWorld;
import com.fengmaster.lifegameserver.service.LgUserService;
import com.fengmaster.lifegameserver.service.LgWorldService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private LgWorldService worldService;

    /**
     * 玩家注冊
     * @return
     */
    @Override
    public boolean register(@Valid LgUser lgUser){
        createUser(lgUser);
        return true;
    }

    private void createUser(LgUser lgUser) {
        //生成UUID
        lgUser.setUuid(CommonUtil.randomUUID());
        //sha256加密密码
        lgUser.setPassword(SecureUtil.sha256(lgUser.getPassword()));
        save(lgUser);
    }

    @Override
    public void login(String userName, String password) {
        //添加用户认证信息
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(userName, SecureUtil.sha256(password));
        try {
            //进行验证，这里可以捕获异常，然后返回对应信息
            subject.login(usernamePasswordToken);
            UserUtil.setUserSession(getUserByUserName(userName));
        } catch (AuthenticationException e) {
            throw new BusinessException(-1,"登录帐号或者密码错误");
        }
    }

    @Override
    public LgUser getUserByUserName(String userName) {
        return getOne(new QueryWrapper<>(new LgUser().setName(userName)));
    }




}