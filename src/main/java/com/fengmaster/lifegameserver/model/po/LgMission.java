package com.fengmaster.lifegameserver.model.po;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * 任务(LgMission)表实体类
 *
 * @author makejava
 * @since 2020-08-31 10:44:28
 */
@SuppressWarnings("serial")
@Data
public class LgMission extends Model<LgMission> {

    private String uuid;
    //任务名
    private String name;
    //任务描述
    private String desc;
    //任务类型列表UUID
    private String typeListUuid;
    //综合难度
    private Integer difficulty;
    //任务重复类型
    private Integer repeatType;
    //重复的间隔时间(根据类型不同表示的单位不同)

    private Integer repeatInterval;
    //可重复次数
    private Integer repeatAvailableTime;
    //任务过期后是否自动失败
    private Integer autoFail;




    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.uuid;
    }
}