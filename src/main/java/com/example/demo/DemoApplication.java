package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        // 初始化SpringContext
        //System.out.println("你好");
        SpringApplication.run(DemoApplication.class, args);
    }
}

// 什么叫模板引擎
// 模板引擎，就是把指定编码的文件，转化成Servlet类
// thymeleaf

// 采用嵌入式的Tomcat容器
