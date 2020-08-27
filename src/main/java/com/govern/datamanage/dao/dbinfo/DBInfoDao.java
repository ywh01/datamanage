package com.govern.datamanage.dao.dbinfo;

import com.govern.datamanage.entity.DBInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface DBInfoDao {
    /**
     * @see 根据用户id查询数据源
     * @param 用户id
     * @return 数据源数组
     */
    List<DBInfo> queryDBInfoByUser(String userId);

    /**
     * @see 根据id查询数据源
     * @param 数据源id
     * @return 单个数据源对象
     */
    DBInfo queryDBInfoById(String id);

    /**
     * @see 增加一个数据源
     * @param dbInfo
     * @return 成功结果数
     */
    int insertDBInfo(DBInfo dbInfo);

    /**
     * @see 更新数据源信息
     * @param dbInfo
     * @return 成功结果数
     */
    int updateDBInfo(DBInfo dbInfo);

    /**
     * @see 删除数据源
     * @param id
     * @return 成功结果数
     */
    int deleteDBInfo(String id);
}
