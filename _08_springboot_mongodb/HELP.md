# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.1.9.RELEASE/maven-plugin/)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.1.9.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Data MongoDB](https://docs.spring.io/spring-boot/docs/2.1.9.RELEASE/reference/htmlsingle/#boot-features-mongodb)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing Data with MongoDB](https://spring.io/guides/gs/accessing-data-mongodb/)

### SpringBoot 整合MongoDB
要点:
* 依赖，配置文件，dao层的继承方式
* 启动类实现CommandLineRunner接口，可在run方法中编写测试逻辑，该方法会在项目启动的时候一起执行
* 着重了解dao层方法的MongoDB命名规则,以及启动类中run方法中调用的内置方法的使用
---
**注:在本地需要安装MongoDB数据库**
