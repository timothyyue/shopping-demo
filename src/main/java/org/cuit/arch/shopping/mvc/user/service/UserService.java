package org.cuit.arch.shopping.mvc.user.service;

import org.cuit.arch.shopping.mvc.user.entity.User;

import java.util.List;

/**
 * Function: Please Descrip This Class.
 * <p>
 * Created by timothy on 28/06/2017.
 * Copyright (c) 2017,baolingy@jumei.com All Rights Reserved.
 */
public interface UserService {

    /**
     * 曾加用户
     * @param user
     * @return
     */
    int insert(User user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    int remove(String id);

    /**
     * 用户更新
     * @param user
     * @return
     */
    int modify(User user);

    /**
     * 用户查询
     * @param id
     * @return
     */
    User get(String id);

    /**
     * 查询所有用户
     * @return
     */
    List<User> find();
}
