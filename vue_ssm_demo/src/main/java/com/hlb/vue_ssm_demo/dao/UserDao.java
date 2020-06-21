package com.hlb.vue_ssm_demo.dao;

import com.hlb.vue_ssm_demo.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserDao {

    @Select("select * from user")
    public List<User> findAll();

    @Select("select * from user where id = #{id}")
    public User findUserById(@Param("id") Integer id);

    @Update("UPDATE `user` SET age = #{age} , username = #{username} , PASSWORD = #{PASSWORD} , email = #{email} , sex = #{sex} WHERE id = #{id}")
    public int updateUserById(User user);

    @Delete("delete from user where id = #{id}")
    public int deleteUserById(@Param("id")Integer id);
}
