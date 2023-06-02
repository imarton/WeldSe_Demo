package demo.weld;

import demo.weld.model.User;
import demo.weld.service.UserService;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import javax.enterprise.inject.Any;
import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import javax.inject.Inject;

public class Main {


    public static void main(String[] args) {
        try(SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            UserService us = container.select(UserService.class).get();
            System.out.println("#1: "+us.getUser());
        }

        System.out.println("Done");
    }
}
