package com.datamanage.business.base.dao;

import com.alibaba.fastjson.JSONObject;
import com.datamanage.business.base.model.UserModel;

public interface UserMapper {

    UserModel getUserModelByID(String id);
}
