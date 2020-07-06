package org.demonzsd.springbootjpademo.service.impl;

import org.demonzsd.springbootjpademo.dao.UserDao;
import org.demonzsd.springbootjpademo.entity.pojo.User;
import org.demonzsd.springbootjpademo.entity.responses.UserResp;
import org.demonzsd.springbootjpademo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserServiceImpl is the implements for {@code UserService}
 *
 * @author by DemonZSD
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public void addUsers(List<User> users) {
        userDao.saveAll(users);
    }

    @Override
    public UserResp getUser(long id) {
        User user = userDao.getOne(id);
        UserResp userResp = new UserResp();
        return userResp.copyOfUser(user);
    }
}
