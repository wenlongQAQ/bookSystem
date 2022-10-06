package com.zzut.dao;

import com.zzut.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface UserDao {
    @Select("select * from userdata where user_name = #{userName} and user_password = #{userPassword}")
    @Results({
            @Result(property = "userName",column = "user_name"),
            @Result(property = "userPassword",column = "user_password"),
            @Result(property = "userIdentity",column = "identity")

    }
    )
    User getUserData(User user);
}
