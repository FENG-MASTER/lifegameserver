package com.fengmaster.lifegameserver.interfaces.model;

import cn.hutool.core.collection.ListUtil;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;
import lombok.experimental.Accessors;

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

        public BaseResponseData() {
        }

        private long count;
        private long total;

        private List<T> list;

    }

    public static  BaseResponse successWithData(String msg,Object t){
        return new BaseResponse().setData(t!=null?new BaseResponseData(1, ListUtil.toList(t)):null).setCode(0).setMessage(msg);
    }

    public static  BaseResponse successWithMsg(String msg){
        return new BaseResponse().setData(null).setMessage(msg).setCode(0);
    }

    public static  BaseResponse success(Object t){
        return new BaseResponse().setData(null).setMessage("操作成功").setData(t!=null?new BaseResponseData(1, ListUtil.toList(t)):null).setCode(0);
    }

    public static  BaseResponse error(String message,int code){
        return new BaseResponse().setMessage(message).setCode(code);
    }

    public static  BaseResponse error(String message){
        return new BaseResponse().setMessage(message).setCode(-1);
    }

    public static BaseResponse page(Page page){
        return new BaseResponse().setCode(0).setData(new BaseResponseData().setTotal(page.getTotal()).setCount(page.getRecords()==null?0:page.getRecords().size()).setList(page.getRecords()));
    }
}
