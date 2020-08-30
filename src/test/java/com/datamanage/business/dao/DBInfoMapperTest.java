package com.datamanage.business.dao;

import com.datamanage.business.model.DBInfo;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class DBInfoMapperTest extends TestCase {
    @Autowired
    private DBInfoMapper dbInfoMapper;

    @Test
    void queryDBInfoByUser() {
        dbInfoMapper.queryDBInfoByUser("1");
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