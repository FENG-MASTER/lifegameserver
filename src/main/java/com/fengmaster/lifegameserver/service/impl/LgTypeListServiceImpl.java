package com.fengmaster.lifegameserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fengmaster.lifegameserver.dao.LgTypeListDao;
import com.fengmaster.lifegameserver.model.po.LgTypeList;
import com.fengmaster.lifegameserver.service.LgTypeListService;
import org.springframework.stereotype.Service;

/**
 * 分类列表(LgTypeList)表服务实现类
 *
 * @author makejava
 * @since 2020-08-31 10:44:34
 */
@Service("lgTypeListService")
public class LgTypeListServiceImpl extends ServiceImpl<LgTypeListDao, LgTypeList> implements LgTypeListService {

}