package com.didispace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public User dc() {
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return new User(1,"2");
    }

    @GetMapping("/dc2")
    public User dc2() {
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return new User(1,"2");
    }

    @GetMapping("/dc3")
    public User dc3() {
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        //报错
        System.out.println(1/0);
        return new User(1,"2");
    }

}
