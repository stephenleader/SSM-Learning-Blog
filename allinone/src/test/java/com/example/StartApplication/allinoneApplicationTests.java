package com.example.StartApplication;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class allinoneApplicationTests {
    @Test
    public void test01(){
        System.out.println("hellotest01");
    }
}
/*
@NotNull(message = "名字不为空"）
private String username;
@Max(value = 120,message = "年龄最大不能超过120"）
private int age；
@Email（message = “邮箱格式错误”）
private String email;

空检查
@Null 验证对象是否为null
@NotNull 验证对象那个是否为null，无法检查长度为0的字符串
@NotBlank 检查约束字符串时候Null还有被Trim的长度是否大于0，支队字符串，并且会去掉前后空格。
 */