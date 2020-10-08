package com.datamanage.business.base.dao;

import com.datamanage.business.base.entity.UnitModel;

import java.util.List;

public interface UnitMapper {
    List<UnitModel> getUnitModelList(String selectName);

    int insertUnit(UnitModel unitModel);

    int updateUnit(UnitModel unitModel);

    int delUnitData(String[] list);
}
