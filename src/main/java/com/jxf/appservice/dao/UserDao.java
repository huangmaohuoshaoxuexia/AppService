package com.jxf.appservice.dao;

import com.jxf.appservice.bean.UserBean;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    UserBean selectByPrimaryKey(@Param("id") int userId);

}
