package com.didispace;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "eureka-client", fallback = DcClientFallback.class)
//@FeignClient(name = "eureka-client")
public interface DcClient {

    @GetMapping("/dc")
    String consumer();

    @GetMapping("/dc2")
    User consumer2();

    @GetMapping("/dc3")
    String consumer3();

}
