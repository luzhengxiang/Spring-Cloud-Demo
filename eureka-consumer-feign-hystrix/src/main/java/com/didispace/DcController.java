package com.didispace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {

    @Autowired
    DcClient dcClient;

    @GetMapping("/consumer")
    public String dc() {
        return dcClient.consumer();
    }

    @GetMapping("/consumer2")
    public User dc2() {
        User user = dcClient.consumer2();
        System.out.println("user.id:"+user.getId());
        return user;
    }

}
