# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.1.9.RELEASE/maven-plugin/)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.1.9.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring for RabbitMQ](https://docs.spring.io/spring-boot/docs/2.1.9.RELEASE/reference/htmlsingle/#boot-features-amqp)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Messaging with RabbitMQ](https://spring.io/guides/gs/messaging-rabbitmq/)

### SpringBoot整合RabbitMQ

要点：
* 依赖导入
* 一个消息接收类Receiver.class以及注解@Component
* 先关bean的注册在启动类中
* 测试类中消息发送中方法的具体调用操作
---
注：
* 本地或者远程服务器需要安装rabbitmq消息中间件并启动服务