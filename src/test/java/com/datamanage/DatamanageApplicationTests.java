package com.datamanage;

import com.datamanage.business.base.dao.DBInfoMapper;
import com.datamanage.business.base.dao.UserMapper;
import com.datamanage.business.base.model.DBInfo;
import com.datamanage.business.base.model.UserModel;
import com.datamanage.common.utils.pwd.DoubleMd5Utils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
