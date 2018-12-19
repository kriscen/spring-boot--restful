package com.kris.springboot;

import com.kris.springboot.config.MyMvcConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

    @Test
    public void contextLoads() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyMvcConfig.class);
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println("beanName:"+name);
        }
    }

}
