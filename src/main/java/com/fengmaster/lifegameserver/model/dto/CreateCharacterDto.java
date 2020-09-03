package com.fengmaster.lifegameserver.model.dto;

import lombok.Data;

/**
 * 创建角色请求结构体
 */
@Data
public class CreateCharacterDto {

    private String name;
    //头衔
    private String title;
    //介绍

    private String introduction;


}
