package demo.weld.service;

import demo.weld.model.User;


import javax.enterprise.context.Dependent;
import javax.inject.Inject;



@Dependent
public class UserService {

    @Inject
    private User user;

    public User getUser() {
        return this.user;
    }

}
