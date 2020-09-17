package com.datamanage.business.common.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.datamanage.business.common.service.DataSourceService;
import com.datamanage.common.tokenconfig.UserLoginToken;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class DataSourceController {
    private static final Logger log = LoggerFactory.getLogger(DataSourceController.class);

    @Autowired
    private DataSourceService dataSourceService;

    @UserLoginToken
    @ApiOperation(value = "登录接口", notes = "判断账号密码是否正确，如果正确，加载所属权限组菜单及权限")
    @RequestMapping(value = "/getAllDataSource", method = RequestMethod.POST)
    public String getAllDataSource(String userId, int pageNum, int pageSize){
        String pageDBByUserId = dataSourceService.getPageDBByUserId(userId, pageNum, pageSize);
        return pageDBByUserId;
    }
}
