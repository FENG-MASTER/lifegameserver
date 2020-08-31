package com.fengmaster.lifegameserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fengmaster.lifegameserver.dao.LgObjWorldDao;
import com.fengmaster.lifegameserver.model.po.LgObjWorld;
import com.fengmaster.lifegameserver.service.LgObjWorldService;
import org.springframework.stereotype.Service;

/**
 * 对象所处世界表(LgObjWorld)表服务实现类
 *
 * @author makejava
 * @since 2020-08-31 10:44:31
 */
@Service("lgObjWorldService")
public class LgObjWorldServiceImpl extends ServiceImpl<LgObjWorldDao, LgObjWorld> implements LgObjWorldService {

}