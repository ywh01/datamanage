package com.datamanage.business.base.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.datamanage.business.base.dao.UserMapper;
import com.datamanage.business.base.model.UserModel;
import com.datamanage.common.utils.caseex.CaseUtils;
import com.datamanage.common.utils.login.TokenUtil;
import com.datamanage.common.utils.pwd.DoubleMd5Utils;
import com.datamanage.common.utils.result.BaseResultGenerator;
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
        String res = "";
        UserModel userModel = userMapper.getUserModelByID(id);
        JSONObject userObj = (JSONObject) JSONObject.toJSON(userModel);

        if(userObj != null){
            String[] str = new String[]{"id","name","pwd","remark","roleType","userType","unitID","roleGroup","createTime","modifier","updateTime"};
            JSONObject jsonObject = CaseUtils.JSONObjectLower(userObj, str);
            pwd = DoubleMd5Utils.formPassToDBPass(pwd, salt);
            if(jsonObject.getString("pwd").equals(pwd)){
                String token = TokenUtil.getToken(userModel);
                res = BaseResultGenerator.success("登录成功!", token, jsonObject);
            }else{
                res = BaseResultGenerator.failure("密码错误!", null);
            }
        }else{
            res = BaseResultGenerator.failure("账号错误!", null);
        }
        return res;
    }
}
