package controller;

import ModelData.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping(value = "/hello/{id}")
    public User login(@PathVariable("id") Integer id) {
        User login_user = new User();
        login_user.setId(id);
        return login_user;
    }
}
