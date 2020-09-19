package com.datamanage.business.base.controller;

import com.datamanage.business.base.model.UserModel;
import com.datamanage.business.base.service.LoginService;
import com.datamanage.business.base.service.UnitService;
import com.datamanage.common.tokenconfig.UserLoginToken;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
     @ApiOperation(value = "获取所有单位信息", notes = "")
     @RequestMapping(value = "/getAllUnit", method = RequestMethod.POST)
     public String getUnitModelList(int pageNum, int pageSize, String selectName){
         String res = unitService.getUnitModelList(pageNum, pageSize, selectName);
         return res;
     }
}
