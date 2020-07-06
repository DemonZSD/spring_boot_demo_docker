package org.demonzsd.springbootjpademo.dao;

import org.demonzsd.springbootjpademo.entity.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserDao is a repository for UserService Entity
 *
 * @author by DemonZSD
 */
public interface UserDao extends JpaRepository<User, Long> {

}
