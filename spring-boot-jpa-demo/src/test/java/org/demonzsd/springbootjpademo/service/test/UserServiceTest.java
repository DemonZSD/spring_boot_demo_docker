package org.demonzsd.springbootjpademo.service.test;

import org.demonzsd.springbootjpademo.entity.pojo.User;
import org.demonzsd.springbootjpademo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * UserServiceTest test the UserService implements
 *
 * @author by DemonZSD
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void insertUsers(){
        List<User> users = new ArrayList<>();
        User user = new User();
        user.setAge(18);
        user.setPassword("123456");
        user.setUname("gougou");

        User user2 = new User();
        user2.setAge(22);
        user2.setPassword("123456");
        user2.setUname("liuliu");
        User user3 = new User();
        user3.setAge(31);
        user3.setPassword("123456");
        user3.setUname("niuniu");
        users.add(user);
        users.add(user2);
        users.add(user3);
        userService.addUsers(users);
    }
}
