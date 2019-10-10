# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.1.9.RELEASE/maven-plugin/)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.1.9.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

### SpringBoot使用注解操作定时任务

要点：
* 在启动类上加上注解@EnableScheduling
* 在需要操作的方法上加上注解@Scheduled
---
注：
@Scheduled多种类型
* @Scheduled(fixedRate = 5000) ：上一次开始执行时间点之后5秒再执行
* @Scheduled(fixedDelay = 5000) ：上一次执行完毕时间点之后5秒再执行
* @Scheduled(initialDelay=1000, fixedRate=5000) ：第一次延迟1秒后执行，之后按fixedRate的规则每5秒执行一次
* @Scheduled(cron=" /5 ") ：通过cron表达式定义规则
