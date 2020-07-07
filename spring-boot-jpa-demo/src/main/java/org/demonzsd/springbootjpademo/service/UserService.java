package org.demonzsd.springbootjpademo.service;

import org.demonzsd.springbootjpademo.entity.pojo.User;
import org.demonzsd.springbootjpademo.entity.requests.UserRequest;
import org.demonzsd.springbootjpademo.entity.responses.UserResp;
import org.demonzsd.springbootjpademo.exceptions.SpringbootJpaDemoException;

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
     * @exception SpringbootJpaDemoException
     */
    void addUsers(List<UserRequest> users) throws SpringbootJpaDemoException;

    /**
     * getUser by user's id
     * @author DemonZSD
     * @param id get User instance by id, if empty return null
     * @return {@code org.demonzsd.springbootjpademo.entity.responses.UserResp}
     * @exception SpringbootJpaDemoException if empty thrown a {@code org.demonzsd.springbootjpademo.exceptions.NotFoundException}
     */
    UserResp getUser(long id) throws SpringbootJpaDemoException;


}
