package com.datamanage;

import com.datamanage.business.common.dao.DataSourceMapper;
import com.datamanage.business.common.model.DataSource;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class DatamanageApplicationTests {

    @Autowired
    private javax.sql.DataSource dataSource;

    @Test
    void contextLoads() {
        System.out.println(dataSource);
    }

    @Autowired
    private DataSourceMapper dataSourceMapper;

    @Test
    void queryCount() {
        Page<Object> page = PageHelper.startPage(1,5);
        DataSource DATASOURCE = dataSourceMapper.queryDBInfoById("1");
        System.out.println("总条数"+page.getTotal()+"---点前页"+page.getPageNum());
        System.out.println(DATASOURCE);
    }

}
