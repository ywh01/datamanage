package com.datamanage.business.base.controller;

import com.alibaba.fastjson.JSONArray;
import com.datamanage.business.base.model.UnitModel;
import com.datamanage.business.base.service.UnitService;
import com.datamanage.common.tokenconfig.UserLoginToken;
import com.datamanage.common.utils.json.JSONUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 这里实现单位注册，删除，修改，查询功能
 */
 @RestController
 @ResponseBody
 @Api("单位注册，删除，修改，查询功能")
public class UnitManageController {

     @Autowired
     private UnitService unitService;

     @UserLoginToken
     @ApiOperation(value = "根据分页获取单位信息", notes = "")
     @RequestMapping(value = "/getUnitByPage", method = RequestMethod.POST)
     public String getUnitModelList(int pageNum, int pageSize, String selectName){
         String res = unitService.getUnitModelList(pageNum, pageSize, selectName);
         return res;
     }

    @CrossOrigin
    @ApiOperation(value = "获取所有的单位信息", notes = "")
    @RequestMapping(value = "/getAllUnit", method = RequestMethod.POST)
    public String getAllUnitModelList(){
        String res = unitService.getAllUnitModelList();
        return res;
    }

    @UserLoginToken
    @ApiOperation(value = "新增单位", notes = "")
    @RequestMapping(value = "/insertUnit", method = RequestMethod.POST)
    public String insertUnit(String reqData){
        UnitModel unitModel = JSONUtil.toObject(reqData, UnitModel.class);
        String res = unitService.insertUnit(unitModel);
        return res;
    }

    @UserLoginToken
    @ApiOperation(value = "修改单位信息", notes = "")
    @RequestMapping(value = "/updateUnit", method = RequestMethod.POST)
    public String updateUnit(String reqData){
        UnitModel unitModel = JSONUtil.toObject(reqData, UnitModel.class);
        String res = unitService.updateUnit(unitModel);
        return res;
    }

    @UserLoginToken
    @ApiOperation(value = "删除单位信息", notes = "")
    @RequestMapping(value = "/delUnitData", method = RequestMethod.POST)
    public String delUnitData(@RequestBody String[] reqData){
        String res = unitService.delUnitData(reqData);
        return res;
    }
}
