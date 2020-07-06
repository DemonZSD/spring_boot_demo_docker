package org.demonzsd.springbootjpademo.controller;

import com.google.gson.Gson;
import org.demonzsd.common.api.response.SingletonResp;
import org.demonzsd.springbootjpademo.entity.pojo.User;
import org.demonzsd.springbootjpademo.entity.responses.UserResp;
import org.demonzsd.springbootjpademo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController the viewer for user, includes show user, add user, delete user and so on.
 *
 * @author by DemonZSD
 */
@RestController
public class UserController extends BaseController{


    @Autowired
    private UserService userService;

    @GetMapping(value = "/user/{id}")
    public String getUser(@PathVariable("id") long id){
        UserResp userResp = userService.getUser(id);
        return gson.toJson(SingletonResp.builder().success("ok", userResp));
    }
}
