package com.datamanage.business.common.controller;

import com.datamanage.business.common.service.DataSourceService;
import com.datamanage.common.tokenconfig.UserLoginToken;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("数据源的注册，删除，修改，查询功能")
public class DataSourceController {
    private static final Logger log = LoggerFactory.getLogger(DataSourceController.class);

    @Autowired
    private DataSourceService dataSourceService;

    @UserLoginToken
    @ApiOperation(value = "分页查询数据源接口", notes = "分页查询所有数据源")
    @RequestMapping(value = "/dataSource/getAllDataSource", method = RequestMethod.POST)
    public String getAllDataSource(String selectName, int pageNum, int pageSize){
        String pageDBByUserId = dataSourceService.getAllDataSource(selectName, pageNum, pageSize);
        return pageDBByUserId;
    }
}
