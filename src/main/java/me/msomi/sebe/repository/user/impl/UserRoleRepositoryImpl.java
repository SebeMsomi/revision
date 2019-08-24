package me.msomi.sebe.repository.user.impl;

import me.msomi.sebe.domain.user.UserRole;
import me.msomi.sebe.repository.user.UserRoleRepository;

import java.util.HashSet;
import java.util.Set;

public class UserRoleRepositoryImpl implements UserRoleRepository {

    private Set<UserRole> userRoleDB;
    private static UserRoleRepository userRoleRepository = null;

    private UserRoleRepositoryImpl() {
        this.userRoleDB = new HashSet<>();
    }

    public static UserRoleRepository getUserRoleRepository() {
        if (userRoleRepository == null) userRoleRepository = new UserRoleRepositoryImpl();
        return userRoleRepository;
    }

    //TODO: Implement body
    @Override
    public UserRole create(UserRole userRole) {
        this.userRoleDB.add(userRole);
        return userRole;

    }

    //TODO: Implement body
    @Override
    public UserRole read(UserRole userRole) {
       return this.userRoleDB.stream()
               .filter(userRole1 -> userRole1.getRoleId().trim().equals(userRole))
               .findAny().orElse(null);
    }

    //TODO: Implement body
    @Override
    public UserRole update(UserRole userRole) {
       UserRole userRole1 = read(userRole);
       if(userRole1 != null)
       {
           this.userRoleDB.remove(userRole1);
           return userRole;
       }
       return null;
    }

    //TODO: Implement body
    @Override
    public void delete(UserRole userRole) {
        UserRole userRole1 = read(userRole);
        if(userRole1 != null)
            this.userRoleDB.remove(userRole1);
    }

    //TODO: Implement body
    @Override
    public Set<UserRole> getAll() {
       return this.userRoleDB;
    }
}
