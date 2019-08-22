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
        roleDB.add(role);
        return role;
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    //TODO: Implement body
    @Override
    public Role read(String id) {

        return roleDB.stream().filter(role -> role.getRoleId() == id).findAny().orElse(null);
    }

    //TODO: Implement body
    @Override
    public Role update(Role role) {
        //throw new UnsupportedOperationException("Not supported yet.");
        Role role1 = read(role.getRoleId());
        if(role1 != null)
        {
            roleDB.remove(role1.getRoleId());
            return create(role);
        }
        return null;
    }

    //TODO: Implement body
    @Override
    public void delete(String roleId) {
        //throw new UnsupportedOperationException("Not supported yet.");
        Role role = read(roleId);
        if(role != null)
        {
            roleDB.remove(role);
        }
    }

    //TODO: Implement body
    @Override
    public Set<Role> getAll() {
        //throw new UnsupportedOperationException("Not supported yet.");
        return roleDB;
    }
}
