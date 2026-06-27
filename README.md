Spring Boot 翻译服务平台

项目简介

本项目是一个基于 Spring Boot、MyBatis 和 MySQL 开发的翻译服务平台，实现了用户登录、翻译订单发布、订单管理等基本功能。

技术栈

* Java
* Spring Boot
* MyBatis
* MySQL
* Maven
* HTML
* CSS
* JavaScript

功能

* 用户登录
* 用户管理
* 发布翻译订单
* 查看翻译订单
* 管理翻译订单

项目结构

src
├── main
│   ├── java
│   │   ├── controller
│   │   ├── service
│   │   ├── mapper
│   │   ├── entity
│   │   └── TranslationPlatformApplication
│   └── resources
│       ├── static
│       └── application.properties

运行方式

1. 克隆项目

git clone https://github.com/Elisepeng/translation-service-platform.git

2. 配置 MySQL 数据库

修改 application.properties 中的数据库连接信息。

3. 启动项目

运行 TranslationPlatformApplication.java。

4. 浏览器访问

http://localhost:8080/login.html

作者

Elisepeng
