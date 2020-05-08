package com.gx.test;

import com.gx.dao.CardDao;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.StandardAnnotationMetadata;

/**
 * @author 高雄
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年01月11日 15:53:00
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        StandardAnnotationMetadata importingClassMetadata1 = (StandardAnnotationMetadata) importingClassMetadata;
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(CardDao.class);
        AbstractBeanDefinition beanDefinition = builder.getBeanDefinition();
        System.out.println("beanDefinition.getBeanClassName===========:" + beanDefinition.getBeanClassName());
        beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(beanDefinition.getBeanClassName());
        beanDefinition.setBeanClass(MyFactoryBean.class);
        registry.registerBeanDefinition("cardDao", beanDefinition);
    }
}
