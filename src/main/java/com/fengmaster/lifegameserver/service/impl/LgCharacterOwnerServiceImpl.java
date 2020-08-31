package com.fengmaster.lifegameserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fengmaster.lifegameserver.dao.LgCharacterOwnerDao;
import com.fengmaster.lifegameserver.model.po.LgCharacterOwner;
import com.fengmaster.lifegameserver.service.LgCharacterOwnerService;
import org.springframework.stereotype.Service;

/**
 * 玩家拥有的对象(LgCharacterOwner)表服务实现类
 *
 * @author makejava
 * @since 2020-08-31 10:44:27
 */
@Service("lgCharacterOwnerService")
public class LgCharacterOwnerServiceImpl extends ServiceImpl<LgCharacterOwnerDao, LgCharacterOwner> implements LgCharacterOwnerService {

}