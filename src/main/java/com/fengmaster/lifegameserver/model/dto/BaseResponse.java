package com.fengmaster.lifegameserver.model.dto;

import lombok.Data;

import java.util.List;

/**
 * Created by Feng-master on 20/03/19.
 */
@Data
public class BaseResponse<T> {

    private String code;

    private String message;

    private BaseResponseData data;


    private static class BaseResponseData<T>{

        public BaseResponseData(long count, List<T> list) {
            this.count = count;
            this.list = list;
        }

        private long count;

        private List<T> list;

    }
}
