package com.govern.datamanage.config.mybatis;
/**
 * 功能
 *      1.将DataSource和mybatis绑定在一起
 */

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
public class SqlSessionFactoryConfig {

    @Value(value = "${mybatis_config_location}")
    private String mapperPath;
    @Value(value = "${mybatis_mapper_locations}")
    private String mybatisConfigFilePath;
    @Value(value = "${mybatis_entity_package}")
    private String entityPackage;

    @Qualifier(value = "sysDataSource")
    private DataSource sysDataSource;

    @Bean(value = "sqlSessionFactory")
    public SqlSessionFactoryBean createSqlSessionFactoryBean(){

        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();

        //引入mybatis-config.xml配置文件
        sqlSessionFactoryBean.setConfigLocation(new ClassPathResource(mybatisConfigFilePath));

        //引入mapper文件路径
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        //这里给mapper文件加上前缀，即“classpath*:”，代表根路径resources目录
        String packageSearchPath = PathMatchingResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX + mapperPath;
        //引入mapper文件
        sqlSessionFactoryBean.setMapperLocations(resolver.getResource(packageSearchPath));

        //引入sysDataSource
        sqlSessionFactoryBean.setDataSource(sysDataSource);

        //映射实体类的路径
        sqlSessionFactoryBean.setTypeAliasesPackage(entityPackage);

        return sqlSessionFactoryBean;
    }
}
