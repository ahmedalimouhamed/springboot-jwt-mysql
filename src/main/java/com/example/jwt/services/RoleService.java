package com.example.jwt.services;

import com.example.jwt.dao.RoleDao;
import com.example.jwt.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public RoleService(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    public Role createNewRole(Role role){
        return this.roleDao.save(role);
    }
}
