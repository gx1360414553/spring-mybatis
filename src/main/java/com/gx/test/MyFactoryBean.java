package com.gx.test;

import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 高雄
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年01月11日 15:46:00
 */
public class MyFactoryBean implements FactoryBean, InvocationHandler {

    Class aClass;

    public MyFactoryBean(Class aClass){
        this.aClass = aClass;
    }

    public Object getObject() throws Exception {
        Object proxyInstance = Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{aClass}, this);
        return proxyInstance;
    }

    public Class<?> getObjectType() {
        return aClass;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Select annotation = method.getAnnotation(Select.class);
        System.out.println(annotation.value()[0]);
        return null;
    }
}
