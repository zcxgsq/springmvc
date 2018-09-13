package com.zcx.service;

import com.zcx.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

import com.zcx.dao.UserDao;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class UserService{

    @Resource
    private UserDao userDao;

    public int insert(User pojo){
        return userDao.insert(pojo);
    }

    public int insertSelective(User pojo){
        return userDao.insertSelective(pojo);
    }

    public int insertList(List<User> pojos){
        return userDao.insertList(pojos);
    }

    public int update(User pojo){
        return userDao.update(pojo);
    }

    public User findById(String id) {
        return userDao.findById(id);
    }
}
