package com.fengmaster.lifegameserver.config;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fengmaster.lifegameserver.common.BusinessException;
import com.fengmaster.lifegameserver.common.JsonRaw;
import com.fengmaster.lifegameserver.model.dto.BaseResponse;
import org.apache.shiro.authz.UnauthorizedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.util.Map;

/**
 * 返回包装处理，包括异常包装处理
 */
@RestControllerAdvice
public class ResultHelperAdviser implements ResponseBodyAdvice<Object> {
    private static final Logger LOG = LoggerFactory.getLogger(ResultHelperAdviser.class);
    private static final AntPathMatcher SWAGGER_ANT_PATH_MATTER = new AntPathMatcher();

    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        return aClass.isAssignableFrom(MappingJackson2HttpMessageConverter.class);
    }

    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        if (isSwaggerV3DocRequest(o,serverHttpRequest)) {
            return new JsonRaw(o.toString());
        }
        else if(o instanceof BaseResponse|| isSwaggerRequest(serverHttpRequest)) {
            return o;
        }

        if(serverHttpResponse instanceof ServletServerHttpResponse){
            HttpStatus httpStatus = HttpStatus.valueOf(((ServletServerHttpResponse) serverHttpResponse).getServletResponse().getStatus());
            if(!httpStatus.is2xxSuccessful()){
                return o;
            }
        }
        if (o instanceof Page){
            //分页信息;
            return BaseResponse.page((Page) o);
        }

        if (o==null){
            //无任何异常就认为是成功
            return BaseResponse.successWithMsg("操作成功");
        }else {
            return BaseResponse.success(o);
        }
    }

    private boolean isSwaggerV3DocRequest(Object o, ServerHttpRequest serverHttpRequest) {
        String requestPath = serverHttpRequest.getURI().getPath();
        return SWAGGER_ANT_PATH_MATTER.match("/v3/api-docs", requestPath);
    }

    private boolean isSwaggerRequest(ServerHttpRequest serverHttpRequest) {
        String requestPath = serverHttpRequest.getURI().getPath();
        return SWAGGER_ANT_PATH_MATTER.match("/swagger-resources", requestPath)
                || SWAGGER_ANT_PATH_MATTER.match("/swagger-resources/**", requestPath)
                || SWAGGER_ANT_PATH_MATTER.match("/v3/api-docs/swagger-config", requestPath);
    }

    @ExceptionHandler(value = BusinessException.class)
    @ResponseBody
    public BaseResponse businessExceptionHandler(BusinessException e){
        LOG.error("业务异常:", e);
        return BaseResponse.error( e.getMessage(),e.getCode());
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public BaseResponse exceptionHandler(Exception e){
        LOG.error("未知异常:", e);
        return BaseResponse.error(e.getMessage());
    }

    @ExceptionHandler(value = UnauthorizedException.class)
    @ResponseBody
    public BaseResponse unauthorizedExceptionHandler(Exception e){
        return BaseResponse.error("你无权进行此操作");
    }

}
