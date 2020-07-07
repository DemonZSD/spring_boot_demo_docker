package org.demonzsd.springbootjpademo.controller;

import org.demonzsd.common.api.RespCode;
import org.demonzsd.common.api.RespMsg;
import org.demonzsd.common.api.response.BaseResp;
import org.demonzsd.common.api.response.SingletonResp;
import org.demonzsd.springbootjpademo.common.CustomConst;
import org.demonzsd.springbootjpademo.entity.pojo.User;
import org.demonzsd.springbootjpademo.entity.requests.UserRequest;
import org.demonzsd.springbootjpademo.entity.responses.UserResp;
import org.demonzsd.springbootjpademo.exceptions.SpringbootJpaDemoException;
import org.demonzsd.springbootjpademo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


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
    public SingletonResp getUser(@PathVariable("id") long id){
        UserResp userResp;
        try {
            userResp = userService.getUser(id);
            logger.info("Get user : {}", userResp);
            return SingletonResp.success(RespCode.SUCCESS_CODE, userResp);
        } catch (SpringbootJpaDemoException e) {
            logger.error("Get user(id={}) failed: {}", id, e.getMessage());
            return SingletonResp.failed(RespCode.SYSTEM_ERR_CODE, RespMsg.RESP_FAILED);
        }

    }

    @PostMapping(value = "/user")
    public BaseResp saveUser(@RequestBody UserRequest userReq){
        try {
            List<UserRequest> users = new ArrayList<>();
            users.add(userReq);
            userService.addUsers(users);
            return BaseResp.success("");
        }catch (SpringbootJpaDemoException e){
            return BaseResp.failed(RespCode.SYSTEM_ERR_CODE, CustomConst.SAVE_ITEMs_FAILED);
        }
    }
}
