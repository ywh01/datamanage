package com.datamanage.business.base.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UnitModel {
    private String id;
    private String pid;
    private String name;
    private String sName;
    private String pName;
    private String remark;
    private String creator;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    private String modifier;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
}
