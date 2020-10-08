package com.datamanage.business.common.dao;

import com.datamanage.business.common.model.DataSource;

import java.util.List;


public interface DataSourceMapper {
    /**
     * 根据用户id查询数据源
     * @param userId
     * @return 数据源数组
     */
    List<DataSource> queryDBInfoByUser(String userId);

    /**
     * 根据id查询数据源
     * @param id
     * @return 单个数据源对象
     */
    DataSource queryDBInfoById(String id);

    /**
     * 增加一个数据源
     * @param DATASOURCE
     * @return 成功结果数
     */
    int insertDBInfo(DataSource DATASOURCE);

    /**
     * 更新数据源信息
     * @param DATASOURCE
     * @return 成功结果数
     */
    int updateDBInfo(DataSource DATASOURCE);

    /**
     * 删除数据源
     * @param id
     * @return 成功结果数
     */
    int deleteDBInfo(String id);

    List<DataSource> getAllDataSource(String selectName);
}
