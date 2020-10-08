package com.datamanage.business.common.service;

import com.alibaba.fastjson.JSONArray;
import com.datamanage.business.base.entity.UnitModel;
import com.datamanage.business.common.dao.DataSourceMapper;
import com.datamanage.business.common.model.DataSource;
import com.datamanage.common.utils.json.JSONUtil;
import com.datamanage.common.utils.result.BaseResultGenerator;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataSourceService {

    @Autowired
    private DataSourceMapper dataSourceMapper;

    public String getPageDBByUserId(String userId, int pageNum, int pageSize){
        Page page = PageHelper.startPage(pageNum, pageSize);
        List<DataSource> DataSources = dataSourceMapper.queryDBInfoByUser(userId);
        JSONArray dbArr = JSONUtil.toJSONArray(DataSources);
        String success = BaseResultGenerator.successArr(dbArr);
        return success;
    }

    public String getAllDataSource(String selectName, int pageNum, int pageSize) {
        selectName = "%"+selectName+"%";
        Page page = PageHelper.startPage(pageNum, pageSize,"UPDATETIME");
        List<DataSource> dataSourceList = dataSourceMapper.getAllDataSource(selectName);
        PageInfo<DataSource> pageInfo = new PageInfo<>(dataSourceList);
        long total = pageInfo.getTotal();
        JSONArray arr = JSONUtil.toJSONArray(dataSourceList);
        String success = BaseResultGenerator.successTotal(total,arr);
        return success;
    }
}
