package com.gx.test;

import com.gx.config.Appconfig;
import com.gx.dao.CardDao;
import com.gx.service.CardService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 高雄
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年01月11日 15:33:00
 */
public class MyTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
        CardService bean = annotationConfigApplicationContext.getBean(CardService.class);
        bean.list("41523");
//        CardDao cardDao = (CardDao) annotationConfigApplicationContext.getBean("cardDao");
//        cardDao.list("123");
    }
}
