package com.datamanage.business.base.dao;

import com.datamanage.business.base.model.UnitModel;

import java.util.List;

public interface UnitMapper {
    List<UnitModel> getUnitModelList(String selectName);
}
