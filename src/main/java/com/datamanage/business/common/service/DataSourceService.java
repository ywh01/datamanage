package com.datamanage.business.common.service;

import com.alibaba.fastjson.JSONArray;
import com.datamanage.business.common.dao.DBInfoMapper;
import com.datamanage.business.common.model.DBInfo;
import com.datamanage.common.utils.json.JSONUtil;
import com.datamanage.common.utils.result.BaseResult;
import com.datamanage.common.utils.result.BaseResultGenerator;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataSourceService {

    @Autowired
    private DBInfoMapper dbInfoMapper;

    public String getPageDBByUserId(String userId, int pageNum, int pageSize){
        Page page = PageHelper.startPage(pageNum, pageSize);
        List<DBInfo> dbInfos = dbInfoMapper.queryDBInfoByUser(userId);
        JSONArray dbArr = JSONUtil.toJSONArray(dbInfos);
        String success = BaseResultGenerator.successArr(dbArr);
        return success;
    }

}
