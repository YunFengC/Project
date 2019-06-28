package com.backstage.service.Impl;

import com.backstage.damain.Permission;
import com.backstage.damain.Role;
import com.backstage.dao.RoleDao;
import com.backstage.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;


    public List<Role> findAll() {
        return roleDao.findAll();
    }

    public void save(Role role) {
         roleDao.save(role);
    }

    public Role findByPeId(String rid) {
        return roleDao.findByPeId(rid);
    }

    public List<Permission> findByRId(String rid) {
        return roleDao.findByRid(rid);
    }

    public void addPermissionToRole(String s, String roleId) {
        roleDao.addPermissionToRole(s,roleId);
    }
}
