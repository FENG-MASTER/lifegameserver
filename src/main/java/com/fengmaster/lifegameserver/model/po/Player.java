package com.fengmaster.lifegameserver.model.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 *
 * @author Feng-master
 * @date 20/03/19
 */
@Data
@ApiModel(description = "玩家持久化对象")
public class Player {

    @ApiModelProperty(value = "玩家UID",name = "uid")
    private String uid;

    @ApiModelProperty(value = "邮箱",name = "email")
    private String email;

    @ApiModelProperty(value = "玩家名",name = "name")
    private String name;

    @ApiModelProperty(value = "玩家简介",name = "desc")
    private String desc;

    @ApiModelProperty(value = "头衔",name = "title")
    private String title;

    @ApiModelProperty(value = "金币数",name = "lifeCoin")
    private int lifeCoin;

    @ApiModelProperty(value = "经验条id",name = "expBarUid")
    private String expBarUid;

    private ExpBar expBar;


}
