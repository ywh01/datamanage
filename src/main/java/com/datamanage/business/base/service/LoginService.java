package com.datamanage.business.base.service;

import com.alibaba.fastjson.JSONObject;
import com.datamanage.business.base.dao.UserMapper;
import com.datamanage.common.utils.caseex.CaseUtils;
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
        JSONObject userObj = userMapper.getUserModelByID(id);
        String[] str = new String[]{"id","name","pwd","remark","roleType","userType","unitID","roleGroup","createTime","modifier","updateTime"};
        JSONObject jsonObject = CaseUtils.JSONObjectLower(userObj, str);

        if(jsonObject != null){
            pwd = DoubleMd5Utils.formPassToDBPass(pwd, salt);
            if(jsonObject.getString("pwd").equals(pwd)){
                res = BaseResultGenerator.success("登录成功!", jsonObject);
            }else{
                res = BaseResultGenerator.failure("密码错误!", null);
            }
        }else{
            res = BaseResultGenerator.failure("账号错误!", null);
        }
        return res;
    }
}
