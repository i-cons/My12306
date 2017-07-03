package com.hust.team5.dao;

import com.hust.team5.entity.User;
import com.hust.team5.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDao {
    @Autowired
    private SqlSession sqlSession;

    public void registerUser(User user){
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.registerUser(user);
    }

    public User validateUser(String userEmail){
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        return userMapper.validateUser(userEmail);
    }

    public User validateUserPassword(User user){
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        return userMapper.validateUserPassword(user);
    }
}
