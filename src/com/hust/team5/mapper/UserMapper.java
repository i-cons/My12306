package com.hust.team5.mapper;

import com.hust.team5.entity.User;
import org.apache.ibatis.annotations.Insert;

public interface UserMapper {
    @Insert("insert into user_info values(userIDSequence.nextval,#{userEmail},#{userPassword}," +
            "#{userName},#{userSex},#{userNumber},#{userPhone},null,null,null)")
    public int insertUser1(User user);
}
