package org.demonzsd.springbootjpademo.entity.requests;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.demonzsd.springbootjpademo.entity.pojo.User;

import java.io.Serializable;

/**
 * UserRequest is a request instance from viewer
 *
 * @author by DemonZSD
 */

@Setter
@Getter
@ToString(exclude = "password")
public class UserRequest extends User implements Serializable {

    @SerializedName("passwd")
    private String password;

}
