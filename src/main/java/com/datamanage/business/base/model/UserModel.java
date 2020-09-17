package com.datamanage.business.base.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel implements Serializable {
    private String id;
    private String name;
    private String pwd;
    private String remark;
    private String roleType;
    private String userType;
    private String unitID;
    private String roleGroup;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    private String modifier;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
}
