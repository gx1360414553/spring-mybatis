package com.gx.config;

import com.gx.annotition.MyMapperScan;
import com.gx.test.MyImportBeanDefinitionRegistrar;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.DriverManager;

/**
 * @author 高雄
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年01月11日 15:34:00
 */
@ComponentScan("com.gx")
//@MapperScan("com.gx.dao")
@Configuration
@MyMapperScan("com.gx.dao")
//@Import(MyImportBeanDefinitionRegistrar.class)
public class Appconfig {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("root");
        driverManagerDataSource.setUrl("jdbc:mysql:///test?useUnicode=true&serverTimezone=UTC ");
        return driverManagerDataSource;
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        return sqlSessionFactoryBean;
    }

}
