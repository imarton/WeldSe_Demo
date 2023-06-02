package demo.weld.service;

import demo.weld.model.User;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

@ApplicationScoped
public class UserFactory {

    @Produces
    public User getUser() {
        return new User("Edebá");
    }
}
