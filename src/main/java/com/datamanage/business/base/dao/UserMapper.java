package com.datamanage.business.base.dao;

import com.alibaba.fastjson.JSONObject;

public interface UserMapper {

    JSONObject getUserModelByIDAndPwd(String id, String pwd);
}
