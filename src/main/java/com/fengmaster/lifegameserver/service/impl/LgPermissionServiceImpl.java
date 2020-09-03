package com.fengmaster.lifegameserver.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fengmaster.lifegameserver.dao.LgCharacterPermissionDao;
import com.fengmaster.lifegameserver.dao.LgUserPermissionDao;
import com.fengmaster.lifegameserver.model.po.LgCharacterPermission;
import com.fengmaster.lifegameserver.model.po.LgUserPermission;
import com.fengmaster.lifegameserver.service.LgPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (LgCharacterPermission)表服务实现类
 *
 * @author makejava
 * @since 2020-09-03 10:05:42
 */
@Service("lgPermissionService")
public class LgPermissionServiceImpl implements LgPermissionService {

    @Autowired
    private LgUserPermissionDao lgUserPermissionDao;

    @Autowired
    private LgCharacterPermissionDao lgCharacterPermissionDao;

    @Override
    public List<LgUserPermission> getAllUserPermission(String userUuid) {
        return lgUserPermissionDao.selectList(new QueryWrapper<>(new LgUserPermission().setUserUuid(userUuid)));
    }

    @Override
    public List<LgCharacterPermission> getAllCharacterPermissionByUserUuid(String userUuid) {
        return lgCharacterPermissionDao.getAllCharacterPermissionByUserUuid(userUuid);
    }

    @Override
    public void initCharacterPermission(String characterUuid) {

    }
}