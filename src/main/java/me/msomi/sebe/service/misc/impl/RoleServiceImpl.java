package me.msomi.sebe.service.misc.impl;

import me.msomi.sebe.domain.misc.Role;
import me.msomi.sebe.repository.misc.RoleRepository;
import me.msomi.sebe.repository.misc.impl.RoleRepositoryImpl;
import me.msomi.sebe.service.misc.RoleService;

import java.util.Set;

public class RoleServiceImpl implements RoleService {

    private RoleRepository roleRepository;
    private static RoleService roleService = null;

    private RoleServiceImpl() {
        this.roleRepository = RoleRepositoryImpl.getRoleRepository();
    }

    public static RoleService getRoleService() {
        if (roleService == null) roleService = new RoleServiceImpl();
        return roleService;
    }


    @Override
    public Role create(Role d) {
        return this.roleRepository.create(d);
    }

    @Override
    public Role read(String roleId) {
        return this.roleRepository.read(roleId);
    }

    @Override
    public Role update(Role role) {
        return this.roleRepository.update(role);
    }

    @Override
    public void delete(String roleId) {
        this.roleRepository.delete(roleId);
    }

    @Override
    public Set<Role> getAll() {
        return this.roleRepository.getAll();
    }
}
