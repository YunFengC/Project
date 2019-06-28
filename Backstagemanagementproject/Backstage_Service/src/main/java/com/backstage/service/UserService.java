package com.backstage.service;

import com.backstage.damain.Role;
import com.backstage.damain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    /**
     * 查询所有用户
     * @return
     */
    List<UserInfo> findAll();

    /**
     * 查询一个用户有多少种权限
     * @param id
     */
    List<Role> addByIdRoleName(String id);

    /**
     * 给用户添加角色
     * @param s
     * @param uid
     */
    void addRoleToUser(String s, String uid);

    /**
     * 增加用户
     * @param userInfo
     */
    void save(UserInfo userInfo);

    /**
     * 删除用户
     * @param s
     */
    void delete(String s);

    /**
     * 根据ID查询角色
     * @param id
     * @return
     */
    UserInfo findUserId(String id);

    /**
     *根据ID查询角色和具体权限
     * @param uid
     * @return
     */
    UserInfo findById(String uid);
}
