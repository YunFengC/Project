package com.backstage.dao;


import com.backstage.damain.Permission;

import java.util.List;

public interface PermissionDao {

    /**
     * 查询角色拥有的资源权限
     */
    List<Permission> findByRid(String rid);

    /**
     * 查询所有权限
     * @return
     */
    List<Permission> findAll();
    /**
     * 添加权限
     */
    void save(Permission permission);

    Permission findById(String peid);

    void deletePermission(String peid);
}
