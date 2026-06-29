# 翻译服务平台（Spring Boot 项目）

## 项目简介
本项目是一个基于 Spring Boot + MyBatis 开发的翻译服务平台，实现了翻译订单从发布、接单、翻译到完成的完整业务流程。

系统模拟真实业务场景中的订单流转机制，并包含简单的权限控制与数据统计功能。


## 技术栈
- Java
- Spring Boot
- MyBatis
- MySQL
- HTML / JavaScript
- Bootstrap
- RESTful API
- Maven

## 核心功能

### 1. 用户与权限模块
- 用户登录
- 基于角色的权限区分（管理员 / 普通用户）

### 2. 订单管理模块
- 发布翻译订单
- 查看订单列表
- 搜索订单
- 删除订单（管理员）

### 3. 订单状态流转（项目亮点⭐）

订单状态设计：

待接单 → 已接单 → 翻译中 → 已完成

实现功能：
- 接单操作
- 开始翻译
- 完成订单

### 4. 数据统计模块
- 总订单数统计
- 已完成订单数统计
- 成交金额统计

## 项目特点
- 基于 RESTful API 设计后端接口
- Service 层进行业务校验（防止非法状态流转）
- 前后端简单分离（HTML + JS + API）
- 实现完整业务流程模拟（接近真实企业订单系统）

## 页面展示

<img width="2229" height="1203" alt="image" src="https://github.com/user-attachments/assets/bcadbba2-124f-4d9c-9a2b-e8982397bcd3" />

<img width="2229" height="1202" alt="image" src="https://github.com/user-attachments/assets/3c219e3c-e253-4d44-aaf9-4cd2d61f8cc4" />

<img width="2229" height="1203" alt="image" src="https://github.com/user-attachments/assets/c706f1d2-a73d-4df3-b97c-2243a533dd4f" />


