# SpringBootDemoAll
放置SpringBoot与其他框架的整合demo

### 01 构建一个基本的SpringBoot项目
---
要点：
* @LocalServerPort 表示获取当前启动的项目端口号，一般订阅一个字段接收它

### 02 SpringBoot配置文件详解
---
要点：
* 01.基本配置文件的使用

* 02.将配置文件的属性赋给实体类

* 03.自定义配置文件

* 04.多环境下配置文件的使用

注：
* 上述四点使用到的代码，所属的部分内容使用了编号 01 02 03 04 进行标识  方便查看

### 03 SpringBoot整合jdbc
要点：
* 主要查看引入的依赖 , 以及dao实现类中调用jdbc对象方法的具体实现步骤
---
注：
* service实现类和controller类的具体操作省略未实现
* 本地需要先安装mysql数据库

### 04 SpringBoot整合JPA
要点：
* 着重查看依赖 配置文件配置 controller中jpa内部方法的调用操作
* dao层方法的命名根据jpa的命名规则
---
注：
* 本地需要先安装mysql数据库

### 05 SpringBoot整合BeatlSql
要点：
* 着重查看依赖 配置 controller层中的内置方法的调用操作  
* 已省略service 实际操作中必须写service层 该技术springboot没有内置需要自己手动注入各种bean类 
---
注：
* 该技术在实际开发中不常用
* sql文件项目03中的resources文件夹下获取
* 该项目中部分对象找不到已注解

### 06 SpringBoot整合MyBatis(注解)
要点：
* 着重查看依赖 数据库连接配置 dao层的注解操作数据库
---
注：
* 需要先安装mysql数据库

### 07 SpringBoot整合声明式事务 mybatis(xml)
要点：
* SpringBoot中使用声明式事务实际只需使用一个注解@Transactional在操作的方法上就可以了  
* 这里使用的orm框架为mybatis并使用xml方式操作数据库 
* 了解配置文件 mapper.xml文件与实体类,dao类的对应关系

### 08 SpringBoot整合MongoDB
要点：
* 依赖，配置文件，dao层的继承方式
* 启动类实现CommandLineRunner接口，可在run方法中编写测试逻辑，该方法会在项目启动的时候一起执行
* 着重了解dao层方法的MongoDB命名规则,以及启动类中run方法中调用的内置方法的使用
---
注：
* 在本地需要安装MongoDB数据库

### 09 SpringBoot整合Redis
要点：
* 依赖，配置文件
* dao层内置方法的调用和相关功能的设置，如设置过期时间等
* 测试类测试方法使用
---
注：
* 需要安装redis数据库在本地或者远程服务上
