package com.datamanage.business.base.dao;

import com.datamanage.business.base.entity.UserModel;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    UserModel getUserModelByID(String id);

    int insertUserModel(@Param("userModel") UserModel userModel);
}
