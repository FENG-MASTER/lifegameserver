package com.fengmaster.lifegameserver.infrastructure.service.impl;

import com.fengmaster.lifegameserver.domain.model.LgCharacterPermission;
import com.fengmaster.lifegameserver.domain.model.LgUserPermission;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

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