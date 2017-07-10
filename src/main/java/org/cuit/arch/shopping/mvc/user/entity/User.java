package org.cuit.arch.shopping.mvc.user.entity;

import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * Function: Please Descrip This Class.
 * <p>
 * Created by timothy on 27/06/2017.
 * Copyright (c) 2017,baolingy@jumei.com All Rights Reserved.
 */
@Alias("user")
public class User {

    private String id;
    private String name;

    public User() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return id.equals(user.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
