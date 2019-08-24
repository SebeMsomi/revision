package me.msomi.sebe.repository.misc.impl;

import me.msomi.sebe.domain.misc.Role;
import me.msomi.sebe.repository.misc.RoleRepository;

import java.util.HashSet;
import java.util.Set;

public class RoleRepositoryImpl implements RoleRepository {

    private Set<Role> roleDB;
    private static RoleRepository roleRepository = null;

    private RoleRepositoryImpl() {
        this.roleDB = new HashSet<>();
    }

    public static RoleRepository getRoleRepository() {
        if (roleRepository == null) roleRepository = new RoleRepositoryImpl();
        return roleRepository;
    }


    //TODO: Implement body
    @Override
    public Role create(Role role) {
        this.roleDB.add(role);
        return role;
    }

    //TODO: Implement body
    @Override
    public Role read(String id) {
        return this.roleDB.stream().filter(role -> role.getRoleId().trim()
        .equals(id)).findAny().orElse(null);

    }

    //TODO: Implement body
    @Override
    public Role update(Role role) {
        Role role1 = read(role.getRoleId());
        if(role1 != null)
        {
            this.roleDB.remove(role1);
            return create(role);
        }
        return null;
    }

    //TODO: Implement body
    @Override
    public void delete(String roleId) {
       Role role = read(roleId);
       if(role != null)
           this.roleDB.remove(role);
    }

    //TODO: Implement body
    @Override
    public Set<Role> getAll() {
       return this.roleDB;
    }
}
