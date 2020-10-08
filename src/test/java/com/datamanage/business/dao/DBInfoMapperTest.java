package com.datamanage.business.dao;

import com.datamanage.business.common.dao.DataSourceMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class DBInfoMapperTest{
    @Autowired
    private DataSourceMapper dataSourceMapper;

    @Test
    void queryDBInfoByUser() {
        dataSourceMapper.queryDBInfoByUser("1");
    }

    @Test
    void queryDBInfoById() {
    }

    @Test
    void insertDBInfo() {
    }

    @Test
    void updateDBInfo() {
    }

    @Test
    void deleteDBInfo() {
    }
}