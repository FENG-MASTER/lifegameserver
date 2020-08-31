package com.fengmaster.lifegameserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fengmaster.lifegameserver.dao.LgItemDao;
import com.fengmaster.lifegameserver.model.po.LgItem;
import com.fengmaster.lifegameserver.service.LgItemService;
import org.springframework.stereotype.Service;

/**
 * 商店物品(LgItem)表服务实现类
 *
 * @author makejava
 * @since 2020-08-31 10:44:28
 */
@Service("lgItemService")
public class LgItemServiceImpl extends ServiceImpl<LgItemDao, LgItem> implements LgItemService {

}