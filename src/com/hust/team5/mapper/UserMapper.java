package com.hust.team5.mapper;

import com.hust.team5.entity.User;
import org.apache.ibatis.annotations.Insert;

public interface UserMapper {
    @Insert("insert into userinfo values(#{userID},#{username},#{userPhone})")
    public int insertUser1(User user);
}
