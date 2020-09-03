package com.fengmaster.lifegameserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fengmaster.lifegameserver.common.util.CharacterUtil;
import com.fengmaster.lifegameserver.common.util.UserUtil;
import com.fengmaster.lifegameserver.dao.LgCharacterDao;
import com.fengmaster.lifegameserver.model.dto.CreateCharacterDto;
import com.fengmaster.lifegameserver.model.po.LgCharacter;
import com.fengmaster.lifegameserver.model.po.LgObjWorld;
import com.fengmaster.lifegameserver.model.po.LgUser;
import com.fengmaster.lifegameserver.model.po.LgWorld;
import com.fengmaster.lifegameserver.service.LgCharacterService;
import com.fengmaster.lifegameserver.service.LgObjWorldService;
import com.fengmaster.lifegameserver.service.LgWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 玩家(LgCharacter)表服务实现类
 *
 * @author makejava
 * @since 2020-08-31 10:44:22
 */
@Service("lgCharacterService")
public class LgCharacterServiceImpl extends ServiceImpl<LgCharacterDao, LgCharacter> implements LgCharacterService {

    @Autowired
    private LgWorldService lgWorldService;

    @Autowired
    private LgObjWorldService lgObjWorldService;

    @Override
    public void createCharacterAndWorld(CreateCharacterDto createCharacterDto) {
        LgCharacter character = createCharacter(createCharacterDto);
        lgWorldService.createNewWorld(character.getName()+"的世界", LgWorld.TYPE.SINGLE,character.getUuid());
        lgObjWorldService.addObj2World(character.getUuid(),lgWorldService.getLastCreateWorldByCharacter(character.getUuid()).getUuid());
    }

    private LgCharacter createCharacter(CreateCharacterDto createCharacterDto) {
        LgUser currentUser = UserUtil.getCurrentUser();
        LgCharacter character = CharacterUtil.initCharacter(new LgCharacter()
                .setName(createCharacterDto.getName())
                .setIntroduction(createCharacterDto.getIntroduction()))
                .setTitle(createCharacterDto.getTitle()).setUserUuid(currentUser.getUuid());
        save(character);
        return character;
    }
}