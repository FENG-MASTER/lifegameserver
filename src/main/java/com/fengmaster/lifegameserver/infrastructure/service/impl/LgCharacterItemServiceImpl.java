package com.fengmaster.lifegameserver.infrastructure.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fengmaster.lifegameserver.infrastructure.mapper.LgCharacterItemDao;
import com.fengmaster.lifegameserver.domain.model.entity.LgCharacterItem;
import com.fengmaster.lifegameserver.infrastructure.service.LgCharacterItemService;
import org.springframework.stereotype.Service;

/**
 * 玩家获得的物品(LgCharacterItem)表服务实现类
 *
 * @author makejava
 * @since 2020-08-31 10:44:26
 */
@Service("lgCharacterItemService")
public class LgCharacterItemServiceImpl extends ServiceImpl<LgCharacterItemDao, LgCharacterItem> implements LgCharacterItemService {

}