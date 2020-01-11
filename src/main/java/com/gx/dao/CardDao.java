package com.gx.dao;

import org.apache.ibatis.annotations.Select;

/**
 * @author 高雄
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年01月11日 15:41:00
 */
public interface CardDao {

    @Select("select * from user")
    void list(String name);
}
