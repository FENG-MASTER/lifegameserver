package com.fengmaster.lifegameserver.common.util;

import cn.hutool.core.lang.UUID;

public class CommonUtil {
    /**
     * 生成UUID
     * @return
     */
    public static String randomUUID(){
        return UUID.randomUUID().toString(true);
    }

}
