package com.datamanage.business.base.service;

import com.alibaba.fastjson.JSONObject;
import com.datamanage.business.base.dao.UserMapper;
import com.datamanage.business.base.model.UserModel;
import com.datamanage.common.tokenconfig.TokenUtil;
import com.datamanage.common.utils.json.JSONUtil;
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
                JSONObject userObj = JSONUtil.toJSONObj(userModel);
                res = BaseResultGenerator.successToken("登录成功!", token, userObj);
            }else{
                res = BaseResultGenerator.failure("密码错误!", null);
            }
        }else{
            res = BaseResultGenerator.failure("账号错误!", null);
        }
        return res;
    }

    public String registerUser(UserModel userModel){
        String res = "";
        //检查是否id重复
        String id = userModel.getId();
        UserModel checkUserId = userMapper.getUserModelByID(id);
        if (userModel != null){
            res = BaseResultGenerator.failure("账号已存在");
        }else{
            int i = userMapper.insertUserModel(userModel);
            if(i > 0){
                res = BaseResultGenerator.failure("账号已存在");
            }else{
                res = BaseResultGenerator.successMessage("创建成功");
            }
        }
        return res;
    }
}
