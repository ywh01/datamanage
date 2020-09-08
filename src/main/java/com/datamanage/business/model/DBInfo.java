package com.datamanage.business.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DBInfo {
    private String id;
    private String name;
    private String driverType;
    private String version;
    private String ip;
    private String port;
    private String db;
    private String user;
    private String password;
    private String remarks;
    private String creator;
    private Date createTime;
    private String modifier;
    private Date updateTime;
}
