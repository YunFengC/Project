package com.backstage.dao;

import com.backstage.damain.Permission;
import com.backstage.damain.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleDao {

    /**
     * 查询条件为UID的结果集
     * @param uid
     * @return
     */
    Role findByUid(String uid);
    /**
     *根据角色查询具体权限
     * @param uid
     * @return Role
     */
    List<Role> findById(String uid);
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
     *根据角色ID查询权限信息
     */
    List<Permission> findByRid(String rid);
    /**
     * 给角色添加权限
     * @param s
     * @param roleId
     */
    void addPermissionToRole(@Param("s") String s,@Param("roleId") String roleId);
}
