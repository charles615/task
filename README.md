## Task

## 1. 项目介绍

简易商城demo：
实现了用户注册，登录，修改密码，查看用户信息的功能， （应用拦截器，白名单）
实现了浏览商品，查看商品详细信息，商品添加添加购物车，清空（结账）购物的车功能。

## 2. 技术使用

前端：Bootstrap

后端：springboot, mybatis-plus, Hibernate

数据库：MySql

版本和工具：IDEA

           MySql 8.0.31 
           
           Java 1.8



## 3. 项目信息


1.项目一共构建了4个实体类（Cart, My, Phone, User), 其中有三个表单，Cart表中一共有三个属性（id, phone_id, user_id), Phone表中一共有6个属性（id, title, price, image, status, content), User表中一共有6个属性（id, email, password, phone, username, salt)

项目实现了对Cart和User表的增删改查。



2.ORM框架使用

Mybatis-plus框架： 内置通用 Mapper、通用 Service，并可以自动注入基本CRUD

Hibernate框架：可以通过实体类自动生成SQL表单

3.UI 界面

<b>用户登录界面：<b>

![屏幕截图(20)](https://user-images.githubusercontent.com/101779773/224899296-2d71e398-b7d5-4b57-ac53-bb15fd7ae152.png)

<b>用户注册界面：<b>

![屏幕截图(21)](https://user-images.githubusercontent.com/101779773/224899353-9ec8e9cf-e66e-4013-b64c-f110c0b123f4.png)

<b>用户修改密码界面：<b>

![屏幕截图(22)](https://user-images.githubusercontent.com/101779773/224899443-5f8be9e7-e488-4a86-adbf-a298f3e284df.png)

<b>主页：<b>

![屏幕截图(23)](https://user-images.githubusercontent.com/101779773/224900079-a6a35032-99e8-4d70-ab0c-72ab4fda40e3.png)

<b>商品列表页：<b>

![屏幕截图(24)](https://user-images.githubusercontent.com/101779773/224900153-08df8e0a-3f55-44d4-b78a-7e9d393264c5.png)


<b>商品详细页：<b>

![屏幕截图(25)](https://user-images.githubusercontent.com/101779773/224900212-41044883-5d42-437e-a86b-d0bf433d90a1.png)

<b>用户信息页：<b>

![屏幕截图(26)](https://user-images.githubusercontent.com/101779773/224900278-b72037da-dbd7-4aa2-9810-473ff0a8551d.png)

<b>购物车页面：<b>

![屏幕截图(27)](https://user-images.githubusercontent.com/101779773/224900336-9bd9d925-d81b-4bb8-808e-a36039d26ea7.png)



## 4. 项目运行方法

1.创建本地Mysql数据库 name：task；端口：3306；username：root； 密码：1234

2.运行文件夹中的**phone** sql脚本文件 生成数据存储表单，（其余表单会自动生成）。

运行task文件夹中的jar包 demo-0.0.1-SNAPSHOT 或 用idea打开文件夹Run application。

