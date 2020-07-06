package org.demonzsd.springbootjpademo.entity.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

/**
 * UserService mapping for t_user table
 *
 * @author by DemonZSD
 */

@Entity
@Table(name = "t_user")
@Setter
@Getter
@ToString(exclude = "password")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String uname;
    private String password;
    @Column(length = 2)
    private int age;

}
