package org.demonzsd.springbootjpademo.entity.requests;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.demonzsd.springbootjpademo.entity.pojo.User;
import org.demonzsd.springbootjpademo.entity.responses.UserResp;

import java.io.Serializable;

/**
 * UserRequest is a request instance from viewer
 *
 * @author by DemonZSD
 */
//
//@Setter
//@Getter
//@ToString
public class UserRequest implements Serializable{
    private long id;
    @SerializedName("name")
    private String uname;
    private int age;

    @SerializedName("passwd")
    private String password;

    public static User turnToUser(UserRequest userReq){
        User user = new User();
        user.setUname(userReq.getUname());
        user.setPassword(userReq.getPassword());
        user.setAge(userReq.getAge());
        return user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserRequest{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", age=" + age +
                '}';
    }
}
