package com.zzut.dao;

import com.zzut.domain.User;
import org.apache.ibatis.annotations.*;

public interface UserDao {
    @Select("select * from userdata where user_name = #{userName} and user_password = #{userPassword}")
    @Results({
            @Result(property = "userName",column = "user_name"),
            @Result(property = "userPassword",column = "user_password"),
            @Result(property = "userIdentity",column = "identity")

    }
    )
    User getUserData(User user);
    @Insert("insert into userdata(id,user_name,user_password,identity ) values(null,#{userName},#{userPassword},'user')")
    Integer addUser(User user);
}
