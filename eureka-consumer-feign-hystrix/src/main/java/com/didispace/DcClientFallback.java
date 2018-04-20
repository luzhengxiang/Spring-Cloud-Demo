package com.didispace;

import org.springframework.stereotype.Component;

@Component
public class DcClientFallback implements DcClient {

    @Override
    public String consumer() {
        System.out.println("consumer报错了");
        return null;
    }

    @Override
    public User consumer2() {
        System.out.println("consumer2报错了");
        return null;
    }

    @Override
    public String consumer3() {
        System.out.println("consumer3报错了");
        return null;
    }
}
