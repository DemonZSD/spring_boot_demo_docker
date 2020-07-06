package org.demonzsd.springbootjpademo.service;

import org.demonzsd.common.api.response.SingletonResp;
import org.demonzsd.springbootjpademo.entity.pojo.User;
import org.demonzsd.springbootjpademo.entity.responses.UserResp;
import org.demonzsd.springbootjpademo.exceptions.ServiceException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserService includes UserPojo operations
 *
 * @author by DemonZSD
 */


public interface UserService extends BaseService{
    /**
     * addUsers add all user witch specified
     *
     * @author DemonZSD
     * @param users will be added to
     */
    void addUsers(List<User> users) throws ServiceException;

    /**
     * getUser by user's id
     * @author DemonZSD
     * @param id get User instance by id, if empty return null
     * @return {@code org.demonzsd.springbootjpademo.entity.responses.UserResp}
     * @exception ServiceException if empty thrown a {@code org.demonzsd.springbootjpademo.exceptions.NotFoundException}
     */
    UserResp getUser(long id) throws ServiceException;
}
