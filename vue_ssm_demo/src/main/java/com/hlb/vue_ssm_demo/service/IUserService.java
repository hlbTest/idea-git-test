package com.hlb.vue_ssm_demo.service;

import com.hlb.vue_ssm_demo.pojo.User;

import java.util.List;

public interface IUserService {

    /**
     * 查询所有用户
     * @return
     */
    public List<User> findAll();

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    public User findUserById(Integer id);

    /**
     * 根据id修改用户
     * @param id
     * @return
     */
    public int updateUserById(User user);

    /**
     * 根据id删除用户
     * @param id
     * @return
     */
    public int deleteUserById(Integer id);
}
