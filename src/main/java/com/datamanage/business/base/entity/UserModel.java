package com.datamanage.business.base.entity;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@TableName("DM_USER")
@ApiModel(value = "用户类", description = "")
public class UserModel implements Serializable {
    private String id;
    private String name;
    private String pwd;
    private String remark;
    private String userType;
    private String roleType;
    private String userName;
    private String position;
    private String phone;
    private String email;
    private String address;
    private String status;
    private String roleGroup;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
}
