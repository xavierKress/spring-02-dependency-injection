package com.demospring.xavierkress.dependencyinjection;

import com.demospring.xavierkress.dependencyinjection.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyinjectionApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DependencyinjectionApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        controller.hello();
    }

}
