/**
 * Project Name:owl-web File Name:UserPermissionController.java Package
 * Name:com.jumei.owl.web.monitor.user.controller Date:2017年1月19日下午6:39:14
 * Copyright (c) 2017, chaoz2@jumei.com All Rights Reserved.
 * 
 */
package org.cuit.arch.shopping.mvc.other.controller;

import org.cuit.arch.shopping.common.SiteController;
import org.cuit.arch.shopping.mvc.user.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Function: Please Descrip This Class.
 * <p>
 * Created by timothy on 27/06/2017.
 * Copyright (c) 2017,baolingy@jumei.com All Rights Reserved.
 */
@Controller
public class MainController extends SiteController {

    @RequestMapping(value = {"","/"})
    public ModelAndView login(HttpServletRequest request) {

        //TODO 登录判断

        return new ModelAndView("login");
    }


}
