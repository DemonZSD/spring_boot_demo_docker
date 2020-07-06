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
@ToString
public class UserResp implements Serializable{

    private long id;
    private String uname;
    @SerializedName("passwd")
    private String password;
    private int age;

    public UserResp copyOfUser(User user){
        this.id = user.getId();
        this.age = user.getAge();
        this.password = user.getPassword();
        this.uname = user.getUname();
        return this;
    }

}
