package com.datamanage.business.base.model;

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
    private Date createTime;
    private String modifier;
    private Date updateTime;
}
