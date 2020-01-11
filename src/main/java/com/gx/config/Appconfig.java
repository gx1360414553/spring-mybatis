package com.gx.config;

import com.gx.annotition.MyMapperScan;
import com.gx.test.MyImportBeanDefinitionRegistrar;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author 高雄
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年01月11日 15:34:00
 */
@ComponentScan("com.gx")
//@MapperScan("com.gx.dao")
@Configuration
@MyMapperScan
//@Import(MyImportBeanDefinitionRegistrar.class)
public class Appconfig {
}
