package com.datamanage.business.base.service;

import com.alibaba.fastjson.JSONArray;
import com.datamanage.business.base.dao.UnitMapper;
import com.datamanage.business.base.model.UnitModel;
import com.datamanage.business.common.model.DBInfo;
import com.datamanage.common.utils.json.JSONUtil;
import com.datamanage.common.utils.result.BaseResultGenerator;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UnitService {

    @Autowired
    private UnitMapper unitMapper;

    public String getUnitModelList(int pageNum, int pageSize, String selectName){
        selectName = "%"+selectName+"%";
        Page page = PageHelper.startPage(pageNum, pageSize);
        System.out.println("111111111111"+page.getTotal());

        List<UnitModel> unitModelList = unitMapper.getUnitModelList(selectName);
        PageInfo<UnitModel> pageInfo = new PageInfo<>(unitModelList);
        long total = pageInfo.getTotal();
        JSONArray arr = JSONUtil.toJSONArray(unitModelList);
        String success = BaseResultGenerator.successTotal(total,arr);
        return success;
    }
}
