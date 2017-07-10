package org.cuit.arch.shopping.mvc.user.dao;

import org.cuit.arch.shopping.mvc.user.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Function: Please Descrip This Class.
 * <p>
 * Created by timothy on 27/06/2017.
 * Copyright (c) 2017,baolingy@jumei.com All Rights Reserved.
 */
@Repository
public interface UserDao {

    public int insert(User entity);
    public int delete(String name);
    public int update(User user);
    public User getUser(String name);

    public List<User> getAllUsers();
}
