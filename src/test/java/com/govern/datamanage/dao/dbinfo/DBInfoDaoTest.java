package com.govern.datamanage.dao.dbinfo;

import com.govern.datamanage.entity.DBInfo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class DBInfoDaoTest {
    @Autowired
    private DBInfoDao dbInfoDao;

    @Test
    void queryDBInfoByUser() {
        List<DBInfo> list = dbInfoDao.queryDBInfoByUser("1");
        assertEquals(2,list.size());
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