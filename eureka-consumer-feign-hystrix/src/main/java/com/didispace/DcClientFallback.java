package com.didispace;

//@Component
public class DcClientFallback implements DcClient {

    @Override
    public String consumer() {
        System.out.println("报错了");
        return null;
    }

    @Override
    public User consumer2() {
        System.out.println("报错了");
        return null;
    }
}
