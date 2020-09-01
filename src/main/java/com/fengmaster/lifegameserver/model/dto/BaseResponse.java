package com.fengmaster.lifegameserver.model.dto;

import cn.hutool.core.collection.ListUtil;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Feng-master on 20/03/19.
 */
@Data
@Accessors(chain  = true)
public class BaseResponse<T> {

    private int code;

    private String message;

    private BaseResponseData data;


    @Data
    private static class BaseResponseData<T>{

        public BaseResponseData(long count, List<T> list) {
            this.count = count;
            this.list = list;
        }

        private long count;

        private List<T> list;

    }

    public static  BaseResponse success(Object t){
        return new BaseResponse().setData(new BaseResponseData(1, ListUtil.toList(t))).setCode(0);
    }

    public static  BaseResponse error(String message,int code){
        return new BaseResponse().setMessage(message).setCode(code);
    }

    public static  BaseResponse error(String message){
        return new BaseResponse().setMessage(message).setCode(-1);
    }
}
