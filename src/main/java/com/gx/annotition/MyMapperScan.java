package com.gx.annotition;

import com.gx.test.MyImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author 高雄
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年01月11日 16:04:00
 */
@Retention(RetentionPolicy.RUNTIME)
@Import(MyImportBeanDefinitionRegistrar.class)
public @interface MyMapperScan {
    String[] value() default {};
}
