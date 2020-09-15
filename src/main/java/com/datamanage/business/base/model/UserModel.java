package com.datamanage.business.base.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    private String id;
    private String name;
    private String pwd;
    private String remark;
    private String roleType;
    private String userType;
    private String unitID;
    private String roleGroup;
    private Date createTime;
    private String modifier;
    private Date updateTime;
}
