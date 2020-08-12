package com.test.demo1.bean;

import com.jf.stuspring.demo1.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.tools.java.ClassPath;

public class testUser {

    @Test
    public void testAdd(){
        ApplicationContext app = new ClassPathXmlApplicationContext("user.xml");
        User u = (User) app.getBean("userA");
        System.out.println(u);
        System.out.println(u.getName());

    }
}
