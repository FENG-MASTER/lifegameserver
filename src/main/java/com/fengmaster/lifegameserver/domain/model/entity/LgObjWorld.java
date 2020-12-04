package com.fengmaster.lifegameserver.domain.model.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 对象所处世界表(LgObjWorld)表实体类
 *
 * @author makejava
 * @since 2020-08-31 10:44:31
 */
@SuppressWarnings("serial")
@Data
@Accessors(chain = true)
public class LgObjWorld extends Model<LgObjWorld> {

    private String worldUuid;

    private String objUuid;


}