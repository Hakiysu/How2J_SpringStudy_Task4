package com.how2java.test;

import com.how2java.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    // only can run at specific java 1.8.0_65
    // jdk download url : https://how2j.cn/k/helloworld/helloworld-jdk/141.html
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        ProductService s = (ProductService) context.getBean("s");
        s.doSomeService();
    }
}