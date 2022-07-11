# SSM-Learning-Blog

- SSM develops Java web applications, and Spring MVC is used for the MVC framework, and Mybatis is used for the persistence layer.

Also, Some learning links are listed as follows:

- [SpringBoot最新教程IDEA版通俗易懂](https://www.bilibili.com/video/BV1PE411i7CV?spm_id_from=333.999.0.0&vd_source=6767562ba1f34266bf27718a756fad89)
* 请注意环境配置
- jdk1.8

- maven 3.6.1

- springboot:最新版

- IDEA

官方提供了而一个快速启动的网站，而IDEA集成了这个网站

- 可以在官网下载，导入IDEA

- 也可以直接使用创建一个springboot项目

前后端分离就是采用，后端打包jar来执行的

## 原理初探

自动配置：

pom.xml

- spring-boot-dependencies:核心依赖在父工程中

- 在注入springboot依赖的时候，不需要指定版本，就因为有这些版本的仓库
  
  ```启动器
   <dependency>
              <groupId>org.springframework.boot</groupId>
              <artifactId>spring-boot-starter-web</artifactId>
          </dependency>
  ```

自动配置

```注释
@SpringBootConfiguration: springboot的配置
    @Configuration: spring配置类
    @Component： 说明这也是一个spring的组件
@EnableAutoConfiguration： 自动配置
    @AutoConfigurationImportSelector.class): 自动配置导入选择
```

## run方法

args是命令行参数

```main
@SpringBootApplication
public class springbootapplication{
    public static void main(String[] args){
    SpringApplication.run(SpringbootDemo.class, args);
}
}
```

Java核心配置，主要就是javaConfig @Configuration @Bean

关于springboot，谈谈你的理解：

- 自动装配

- run（）

- 可以全面接管SpringMVC的配置

- SpringApplication类
  
  - 主要作用有推断应用的类型是普通项目还是Web项目
  
  - 查找斌加载所有可用的初始化器，设置到initializers属性之中去
  
  - 找出所有的应用程序监听器，设置到listeners属性之中
  
  - 推断并设置main方法的定义类，找到运行的主类

## application.yml

yml以数据为中心，是一种标记语言

server：

    port：空格+8081

yml还可以存一个对象

```
student：
    name: qinjiang
    age: 3

#行内写法，和javascript写法一样
student:{name: qinjiang,age:3}

#数组
pets：
    - cat
    - dog

pets：[cat,dog,pig]
```

yaml可以直接给实体类赋值
