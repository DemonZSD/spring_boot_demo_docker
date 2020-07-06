package org.demonzsd.springbootjpademo.service.impl;

import org.demonzsd.springbootjpademo.dao.UserDao;
import org.demonzsd.springbootjpademo.entity.pojo.User;
import org.demonzsd.springbootjpademo.entity.responses.UserResp;
import org.demonzsd.springbootjpademo.exceptions.NotFoundException;
import org.demonzsd.springbootjpademo.exceptions.ServiceException;
import org.demonzsd.springbootjpademo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public void addUsers(List<User> users) throws ServiceException {
        userDao.saveAll(users);
    }

    @Override
    public UserResp getUser(long id) throws ServiceException{
        Optional<User> result= userDao.findById(id);
        return UserResp.copyOfUser(result.orElseThrow(NotFoundException::new));
    }
}
