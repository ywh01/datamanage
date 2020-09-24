package com.datamanage.business.base.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.datamanage.business.base.dao.UnitMapper;
import com.datamanage.business.base.model.UnitModel;
import com.datamanage.business.common.model.DBInfo;
import com.datamanage.common.utils.json.JSONUtil;
import com.datamanage.common.utils.result.BaseResult;
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
        Page page = PageHelper.startPage(pageNum, pageSize,"UPDATETIME");
        List<UnitModel> unitModelList = unitMapper.getUnitModelList(selectName);
        PageInfo<UnitModel> pageInfo = new PageInfo<>(unitModelList);
        long total = pageInfo.getTotal();
        JSONArray arr = JSONUtil.toJSONArray(unitModelList);
        String success = BaseResultGenerator.successTotal(total,arr);
        return success;
    }

    public String getAllUnitModelList() {
        String selectName = "%%";
        List<UnitModel> unitModelList = unitMapper.getUnitModelList(selectName);
        JSONArray arr = JSONUtil.toJSONArray(unitModelList);
        String success = BaseResultGenerator.successArr(arr);
        return success;
    }

    public String insertUnit(UnitModel unitModel) {
        String res = "";
        int count = unitMapper.insertUnit(unitModel);
        if(count == 1){
            res = BaseResultGenerator.successMessage("添加成功");
        }else{
            res = BaseResultGenerator.failure("添加失败");
        }
        return res;
    }

    public String updateUnit(UnitModel unitModel) {
        String res = "";
        int count = unitMapper.updateUnit(unitModel);
        if(count == 1){
            res = BaseResultGenerator.successMessage("修改成功");
        }else{
            res = BaseResultGenerator.failure("修改失败");
        }
        return res;
    }

    public String delUnitData(String[] list) {
        String res = "";
        int count = unitMapper.delUnitData(list);
        if(count == list.length){
            res = BaseResultGenerator.successMessage("删除成功");
        }else{
            res = BaseResultGenerator.failure("删除失败");
        }
        return res;
    }
}
