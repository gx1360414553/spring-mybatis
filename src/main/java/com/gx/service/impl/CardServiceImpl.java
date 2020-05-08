package com.gx.service.impl;

import com.gx.dao.CardDao;
import com.gx.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author 高雄
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年01月11日 15:40:00
 */
@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardDao cardDao;

    public List<Map<Object, Object>> list(String name) {
        return cardDao.list(name);
    }
}
