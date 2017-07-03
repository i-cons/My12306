package com.hust.team5.mapper;

import com.hust.team5.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Insert("insert into user_info values(userIDSequence.nextval,#{userEmail}," +
            "#{userPassword},#{userName},#{userSex},#{userNumber},#{userNumberType}," +
            "#{userPhone},#{userProvince},#{userCity},#{userBirthday},#{userLastLogin}," +
            "#{userState},#{userType},#{userRemark})")
    int registerUser(User user);

    @Select("select * from user_info where userEmail = #{userEmail}")
    User validateUser(String userEmail);

    @Select("select * from user_info where userEmail = #{userEmail} and userPassword = #{userPassword}")
    User validateUserPassword(User user);
}
