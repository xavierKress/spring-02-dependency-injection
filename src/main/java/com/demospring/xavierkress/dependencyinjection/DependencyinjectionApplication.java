package com.demospring.xavierkress.dependencyinjection;

import com.demospring.xavierkress.dependencyinjection.controllers.ConstructorInjectedController;
import com.demospring.xavierkress.dependencyinjection.controllers.MyController;
import com.demospring.xavierkress.dependencyinjection.controllers.PropertyInjectedController;
import com.demospring.xavierkress.dependencyinjection.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyinjectionApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DependencyinjectionApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        controller.hello();

        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
    }

}
