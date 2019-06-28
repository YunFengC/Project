package com.backstage.service.Impl;

import com.backstage.damain.Permission;
import com.backstage.dao.PermissionDao;
import com.backstage.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private PermissionDao permissionDao;


    public List<Permission> findAll() {
        return permissionDao.findAll();
    }

    public void save(Permission permission) {
        permissionDao.save(permission);
    }

    public Permission findById(String peid) {
        return permissionDao.findById(peid);
    }

    public void deletePermission(String peid) {
        permissionDao.deletePermission(peid);
    }
}
