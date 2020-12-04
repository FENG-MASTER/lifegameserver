package com.fengmaster.lifegameserver.infrastructure.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fengmaster.lifegameserver.interfaces.model.CreateCharacterDto;
import com.fengmaster.lifegameserver.domain.model.LgCharacter;

/**
 * 玩家(LgCharacter)表服务接口
 *
 * @author makejava
 * @since 2020-08-31 10:44:22
 */
public interface LgCharacterService extends IService<LgCharacter> {

    /**
     * 创建新的角色
     * @param createCharacterDto
     */
    public void createCharacterAndWorld(CreateCharacterDto createCharacterDto);

}