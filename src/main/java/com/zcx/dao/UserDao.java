package com.zcx.dao;
import com.zcx.base.dao.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.zcx.entity.User;

@Mapper
public interface UserDao {
    int insert(@Param("pojo") User pojo);

    int insertSelective(@Param("pojo") User pojo);

    int insertList(@Param("pojos") List<User> pojo);

    int update(@Param("pojo") User pojo);

    User findById(@Param("id") String id);
}
