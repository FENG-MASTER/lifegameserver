package com.fengmaster.lifegameserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fengmaster.lifegameserver.dao.LgCharacterDao;
import com.fengmaster.lifegameserver.model.po.LgCharacter;
import com.fengmaster.lifegameserver.service.LgCharacterService;
import org.springframework.stereotype.Service;

/**
 * 玩家(LgCharacter)表服务实现类
 *
 * @author makejava
 * @since 2020-08-31 10:44:22
 */
@Service("lgCharacterService")
public class LgCharacterServiceImpl extends ServiceImpl<LgCharacterDao, LgCharacter> implements LgCharacterService {

}