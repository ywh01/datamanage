package com.datamanage.business.base.controller;

import com.datamanage.business.base.entity.UserModel;
import com.datamanage.business.base.service.LoginService;
import com.datamanage.common.tokenconfig.UserLoginToken;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 这里实现注册/登录/登出功能
 */
 @RestController
 @Api("用户登录注册接口")
public class LoginController {

     @Autowired
     private LoginService loginService;

     @CrossOrigin
     @ApiOperation(value = "登录接口", notes = "判断账号密码是否正确，如果正确，加载所属权限组菜单及权限")
     @RequestMapping(value = "/user/loginIn", method = RequestMethod.POST)
     public String loginIn(String id, String pwd){
         String res = loginService.userLogin(id, pwd);
         return res;
     }

     @CrossOrigin
     @ApiOperation(value = "注册用户接口", notes = "单用户创建单位管理员，由单位管理员创建普通用户")
     @RequestMapping(value = "/user/register",method = RequestMethod.POST)
     public String registerUser(@RequestBody UserModel userModel){
        String res = loginService.registerUser(userModel);
        return res;
     }
}
