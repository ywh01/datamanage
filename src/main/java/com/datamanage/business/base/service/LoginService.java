package com.datamanage.business.base.service;

import com.datamanage.business.base.dao.UserMapper;
import com.datamanage.business.base.model.UserModel;
import com.datamanage.common.tokenconfig.TokenUtil;
import com.datamanage.common.utils.pwd.Md5Utils;
import com.datamanage.common.utils.result.BaseResultGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UserMapper userMapper;

    public String userLogin(String id, String pwd) {
        String res = "";
        UserModel userModel = userMapper.getUserModelByID(id);
        if(userModel != null){
            pwd = Md5Utils.hash(pwd);
            if(userModel.getPwd().equals(pwd)){
                String token = TokenUtil.getToken(userModel);
                res = BaseResultGenerator.success("登录成功!", token, userModel);
            }else{
                res = BaseResultGenerator.failure("密码错误!", null);
            }
        }else{
            res = BaseResultGenerator.failure("账号错误!", null);
        }
        return res;
    }
}
