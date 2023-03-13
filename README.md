## Task

## 1. 项目介绍

简易商城demo, 实现了用户注册，登录，修改密码，查看用户信息功能； 实现了浏览商品，查看商品详细信息，添加购物车，清空（结账）购物车功能。

## 2. 技术

前端：Bootstrap

后端：springboot， mybatis-plus，Hibernate，MySql



版本：MySql 8.0.31； Java1.8;



## 3.

1. **The API server should support CRUD operations for a list of employees/cars/records etc... The object must have a minimum of 5 to 6 attributes.** 

项目一共构建了4个实体类（Cart, My, Phone, User), 其中有三个表单，Cart表中一共有三个属性（id, phone_id, user_id), Phone表中一共有6个属性（id, title, price, image, status, content), User表中一共有6个属性（id, email, password, phone, username, salt)

项目实现了对Cart和User表的增删改查。



2.**You’d better to use an ORM tool for CRUD operation, also you can create a simple DB for data storage.**

ORM框架使用：

Mybatis-plus框架： 内置通用 Mapper、通用 Service，并可以自动注入基本CRUD

Hibernate框架：可以通过实体类自动生成SQL表单



数据库使用： Mysql数据库



3. **Write unit/component/integration and functional tests.**

使用了Junit 测试，为后端的mapper层和service层方法代码进行单元测试。







## 4. 项目运行方法

1.创建本地Mysql数据库 name：task；端口：3306；username：root； 密码：1234

2.运行文件夹中的**phone** sql脚本文件 生成数据存储表单，（其余表单会自动生成）。

运行task文件夹中的jar包 demo-0.0.1-SNAPSHOT 或 用idea打开文件夹Run application。

