package com.datamanage.business.base.controller;

import com.datamanage.business.base.service.LoginService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这里实现注册/登录/登出功能
 */
 @RestController
 @ResponseBody
public class LoginController {

     @Autowired
     private LoginService loginService;

     @ApiOperation(value = "登录接口", notes = "判断账号密码是否正确，如果正确，加载所属权限组菜单及权限")
     @RequestMapping(value = "/loginIn", method = RequestMethod.GET)
     public String loginIn(String id, String pwd){
         String res = loginService.userLogin(id,pwd);
         return res;
     }

}
