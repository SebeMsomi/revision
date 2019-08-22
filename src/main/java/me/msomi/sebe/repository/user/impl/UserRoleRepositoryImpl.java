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
        //throw new UnsupportedOperationException("Not supported yet.");
        userRoleDB.add(userRole);
        return userRole;
    }

    //TODO: Implement body
    @Override
    public UserRole read(UserRole userRole) {
        //throw new UnsupportedOperationException("Not supported yet.");
        return userRoleDB.stream().filter(userRole1 -> userRole.equals(userRole)).findAny().orElse(null);
    }

    //TODO: Implement body
    @Override
    public UserRole update(UserRole userRole) {
       /* UserRole userRole1 = read(userRole.getUserEmail());
        if(userRole1 != null)
        {
            userRoleDB.remove(userRole1);
            return create(userRole1);
        }
        return null;*/
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //TODO: Implement body
    @Override
    public void delete(UserRole userRole) {
        //throw new UnsupportedOperationException("Not supported yet.");
        UserRole userRole1 = read(userRole);
        if(userRole1 != null)
        {
            userRoleDB.remove(userRole1);
        }
    }

    //TODO: Implement body
    @Override
    public Set<UserRole> getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
