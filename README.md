项目结构

- api-gateway-with-eureka  服务网关
- eureka-client    服务端
- eureka-client2   服务端2
- eureka-consumer-feign 服务消费者
- eureka-consumer-feign-hystrix  服务消费者（带断路器）
- eureka-server  服务注册中心


1，如何只通过网关访问Client服务，屏蔽非网关过来的请求。
2，对象传输  本身就支持帮我们转成对象。接口调用跟内部方法调用无异。




需要解决的问题
分布式的应用监控，分布式日志监控、
配置中心 Spring Cloud Config
监视仪表板
cloud docker
注册中心集群
服务网关集群
