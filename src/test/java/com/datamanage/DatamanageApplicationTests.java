package com.datamanage;

import com.datamanage.business.common.dao.DBInfoMapper;
import com.datamanage.business.common.model.DBInfo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;


@SpringBootTest
class DatamanageApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Test
    void contextLoads() {
        System.out.println(dataSource);
    }

    @Autowired
    private DBInfoMapper dbInfoMapper;

    @Test
    void queryCount() {
        Page<Object> page = PageHelper.startPage(1,5);
        DBInfo dbInfo = dbInfoMapper.queryDBInfoById("1");
        System.out.println("总条数"+page.getTotal()+"---点前页"+page.getPageNum());
        System.out.println(dbInfo);
    }

}
