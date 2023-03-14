# Task

# 1. 项目介绍

简易商城demo：
实现了用户注册，登录，修改密码，查看用户信息的功能， （应用拦截器，白名单）
实现了浏览商品，查看商品详细信息，商品添加添加购物车，清空（结账）购物的车功能。

# 2. 技术使用

前端：Bootstrap

后端：springboot, mybatis-plus, Hibernate

数据库：MySql

版本和工具：IDEA

           MySql 8.0.31 
           
           Java 1.8



# 3. 项目信息


## 1.数据库信息
项目一共构建了4个实体类（Cart, My, Phone, User), 其中有三个表单，Cart表中一共有三个属性（id, phone_id, user_id), Phone表中一共有6个属性（id, title, price, image, status, content), User表中一共有6个属性（id, email, password, phone, username, salt)

项目实现了对Cart和User表的增删改查。



## 2.ORM框架使用

Mybatis-plus框架： 内置通用 Mapper、通用 Service，并可以自动注入基本CRUD

Hibernate框架：可以通过实体类自动生成SQL表单



## 3.UI 界面

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

![屏幕截图(26)](https://user-images.githubusercontent.com/101779773/224902213-1e32941a-0d43-44b4-979b-7fffa2a424bc.png)


<b>购物车页面：<b>

![屏幕截图(27)](https://user-images.githubusercontent.com/101779773/224902267-2baca565-1965-40a6-846e-c7a413dc34f8.png)


           

 # 4.项目测试
本项目使用了Junit单元测试，三个实体类的Dao层Mapper方法进行了测试，以及User的服务层方法进行测试。
           
![屏幕截图(28)](https://user-images.githubusercontent.com/101779773/224905448-9d55a92d-e633-42de-a87b-1f60c3213b6a.png)


           
           
           
# 5.项目运行方法

1. 该项目所需要的数据库运行环境已经部署并上传在了Docker Hub, 因此秩序只需在安装有Docker的联网电脑上运行：
           
           

Docker pull charles615615/mysql:8.0.31
        
           
           

即可将Mysql Docker镜像拖拽到本地。

2. 运行以下命令 进入并启动Mysql镜像：
           
           
```java Docker ps
Docker exec -it charles615615/mysql:8.0.31 dash
mysql -uroot -p
root  ```java


           
           
3.此时mysql环境已经配置好，接下来便可使用idea或Eclipse工具打开项目文件夹task，配置java环境1.8，后运行即可。

4.浏览器输入”localhost:8081/web/login.html"即可开启项目登录页。
