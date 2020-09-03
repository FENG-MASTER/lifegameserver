package com.fengmaster.lifegameserver.service.impl;

import com.fengmaster.lifegameserver.model.po.LgCharacterPermission;
import com.fengmaster.lifegameserver.model.po.LgUserPermission;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LgPermissionServiceImplTest {

    @Autowired
    private LgPermissionServiceImpl lgPermissionService;

    @Test
    void getAllUserPermission() {
        List<LgUserPermission> allUserPermission = lgPermissionService.getAllUserPermission("4bea384060434ed3867a3f008eb571dd");
        assert !allUserPermission.isEmpty();
    }

    @Test
    void getAllCharacterPermissionByUserUuid() {
        List<LgCharacterPermission> list = lgPermissionService.getAllCharacterPermissionByUserUuid("4bea384060434ed3867a3f008eb571dd");
        assert list.isEmpty();
    }
}