package com.fengmaster.lifegameserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fengmaster.lifegameserver.dao.LgCharacterItemDao;
import com.fengmaster.lifegameserver.model.po.LgCharacterItem;
import com.fengmaster.lifegameserver.service.LgCharacterItemService;
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