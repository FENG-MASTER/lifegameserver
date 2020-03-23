package com.fengmaster.lifegameserver.model.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by Feng-master on 20/03/19.
 */
@Data
@ApiModel(value = "经验条对象")
public class ExpBar {

    @ApiModelProperty(value = "经验条UID",name = "uid")
    private String uid;

    @ApiModelProperty(value = "等级",name = "level")
    private int level;

    @ApiModelProperty(value = "当前经验值",name = "currentExp")
    private int currentExp;




}
