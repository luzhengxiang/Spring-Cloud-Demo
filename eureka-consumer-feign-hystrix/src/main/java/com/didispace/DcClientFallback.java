package com.didispace;

import org.springframework.stereotype.Component;

/**
 * @author 翟永超
 * @create 2017/6/24.
 * @blog http://blog.didispace.com
 */
@Component
public class DcClientFallback implements DcClient {

    @Override
    public String consumer() {
        System.out.println("报错了");
        return null;
    }
}
