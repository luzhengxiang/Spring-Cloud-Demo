package com.didispace;

import feign.FeignException;
import feign.Util;
import feign.codec.ErrorDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * 通过实现 ErrorDecoder 接口来捕获feign 客户端接口请求异常
 */
@Configuration
public class BizExceptionFeignErrorDecoder implements ErrorDecoder {

    private static final Logger logger = LoggerFactory.getLogger(BizExceptionFeignErrorDecoder.class);


    @Override
    public Exception decode(String s, feign.Response response) {
        System.out.println("进入异常处理类中");
        if (response.body() != null) {
            String targetMsg = null;
            try {
                String body = Util.toString(response.body().asReader());
                System.out.println(body);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        return FeignException.errorStatus(s, response);
    }
}
