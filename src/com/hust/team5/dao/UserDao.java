package com.hust.team5.dao;

import com.hust.team5.entity.User;
import com.hust.team5.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDao {
    @Autowired
    private SqlSession sqlSession;

    public void insertUser(User user){
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.insertUser1(user);
    }
}
