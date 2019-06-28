package com.backstage.service;

import com.backstage.damain.Permission;
import com.backstage.damain.Role;

import java.util.List;

public interface RoleService {

    /**
     * 查询所有角色
     */
    List<Role> findAll();

    /**
     * 添加角色
     * @param role
     */
    void save(Role role);

    /**
     * 查询角色详情
     * @return
     */
    Role findByPeId(String rid);
    /**
     * 根据ID查询权限
     */
    List<Permission> findByRId(String rid);

    /**
     * 给角色添加权限
     * @param s
     * @param roleId
     */
    void addPermissionToRole(String s, String roleId);
}
