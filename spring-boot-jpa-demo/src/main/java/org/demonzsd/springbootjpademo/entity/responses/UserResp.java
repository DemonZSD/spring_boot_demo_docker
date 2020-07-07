package org.demonzsd.springbootjpademo.entity.responses;


import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.demonzsd.springbootjpademo.entity.pojo.User;

import java.io.Serializable;

/**
 * UserResp is a response instance for api
 *
 * @author by DemonZSD
 */
@Getter
@Setter
@ToString(exclude = "password")
public class UserResp implements Serializable{

    private long id;
    @SerializedName("name")
    private String uname;
    @SerializedName("passwd")
    private String password;
    private int age;

    /**
     * copyOfUser copy User instance to UserResp.
     * @author DemonZSD
     * @param user pojo instance of table `t_user`
     * @return {@code org.demonzsd.springbootjpademo.entity.responses.UserResp}
     */
    public static UserResp copyOfUser(User user){
        UserResp userResp = new UserResp();
        userResp.setId(user.getId());
        userResp.setAge(user.getAge());
        userResp.setPassword(user.getPassword());
        userResp.setUname(user.getUname());
        return userResp;
    }

}
