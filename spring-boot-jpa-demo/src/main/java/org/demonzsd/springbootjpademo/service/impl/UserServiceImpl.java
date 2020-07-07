package org.demonzsd.springbootjpademo.service.impl;

import org.demonzsd.springbootjpademo.dao.UserDao;
import org.demonzsd.springbootjpademo.entity.pojo.User;
import org.demonzsd.springbootjpademo.entity.requests.UserRequest;
import org.demonzsd.springbootjpademo.entity.responses.UserResp;
import org.demonzsd.springbootjpademo.exceptions.NotFoundException;
import org.demonzsd.springbootjpademo.exceptions.SpringbootJpaDemoException;
import org.demonzsd.springbootjpademo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * UserServiceImpl is the implements for {@code UserService}
 *
 * @author by DemonZSD
 */
@Service
public class UserServiceImpl extends BaseServiceImpl implements UserService  {

    @Autowired
    private UserDao userDao;
    @Override
    public void addUsers(List<UserRequest> usersReq) throws SpringbootJpaDemoException {
        try{
            List<User> users = usersReq.parallelStream()
                    .map(UserRequest::turnToUser)
                    .collect(Collectors.toList());
            userDao.saveAll(users);
        }catch (Exception e){
            logger.error(e.toString());
            throw new SpringbootJpaDemoException(e.toString());
        }
    }

    @Override
    public UserResp getUser(long id) throws SpringbootJpaDemoException {
        Optional<User> result= userDao.findById(id);
        return UserResp.copyOfUser(result.orElseThrow(NotFoundException::new));
    }
}
