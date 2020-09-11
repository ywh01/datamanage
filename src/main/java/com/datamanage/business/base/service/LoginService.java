package com.datamanage.business.base.service;

import com.alibaba.fastjson.JSONObject;
import com.datamanage.business.base.dao.UserMapper;
import com.datamanage.business.base.model.UserModel;
import com.datamanage.common.utils.pwd.DoubleMd5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UserMapper userMapper;

    @Value(value = "${salt}")
    private String salt;

    public String userLogin(String id, String pwd) {
        pwd = DoubleMd5Utils.formPassToDBPass(pwd, salt);
        JSONObject userObj = userMapper.getUserModelByIDAndPwd(id,pwd);
        if(userObj != null){
            System.out.println(userObj);
        }
        return id;
    }
}
