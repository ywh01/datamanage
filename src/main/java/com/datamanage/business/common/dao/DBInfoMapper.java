package com.datamanage.business.common.dao;

import com.datamanage.business.common.model.DBInfo;

import java.util.List;


public interface DBInfoMapper{
    /**
     * 根据用户id查询数据源
     * @param userId
     * @return 数据源数组
     */
    List<DBInfo> queryDBInfoByUser(String userId);

    /**
     * 根据id查询数据源
     * @param id
     * @return 单个数据源对象
     */
    DBInfo queryDBInfoById(String id);

    /**
     * 增加一个数据源
     * @param dbInfo
     * @return 成功结果数
     */
    int insertDBInfo(DBInfo dbInfo);

    /**
     * 更新数据源信息
     * @param dbInfo
     * @return 成功结果数
     */
    int updateDBInfo(DBInfo dbInfo);

    /**
     * 删除数据源
     * @param id
     * @return 成功结果数
     */
    int deleteDBInfo(String id);
}
