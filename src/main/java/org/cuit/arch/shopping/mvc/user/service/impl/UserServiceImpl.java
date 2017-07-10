package org.cuit.arch.shopping.mvc.user.service.impl;

import org.cuit.arch.shopping.common.SiteService;
import org.cuit.arch.shopping.mvc.user.dao.UserDao;
import org.cuit.arch.shopping.mvc.user.entity.User;
import org.cuit.arch.shopping.mvc.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Function: Please Descrip This Class.
 * <p>
 * Created by timothy on 28/06/2017.
 * Copyright (c) 2017,baolingy@jumei.com All Rights Reserved.
 */
@Service
public class UserServiceImpl extends SiteService implements UserService {

    @Autowired
    private UserDao userDao;

    public int insert(User user) {
        return userDao.insert(user);
    }

    public int remove(String id) {
        return userDao.delete(id);
    }

    public int modify(User user) {
        return userDao.update(user);
    }

    public User get(String id) {
        return null;
    }

    public List<User> find() {
        return null;
    }
}
