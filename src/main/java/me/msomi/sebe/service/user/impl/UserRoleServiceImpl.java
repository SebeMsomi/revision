package me.msomi.sebe.service.user.impl;

import me.msomi.sebe.domain.user.UserRole;
import me.msomi.sebe.repository.user.UserRoleRepository;
import me.msomi.sebe.repository.user.impl.UserRoleRepositoryImpl;
import me.msomi.sebe.service.user.UserRoleService;

import java.util.Set;

public class UserRoleServiceImpl implements UserRoleService {

    private UserRoleRepository userRoleRepository;
    private static UserRoleService userRoleService = null;

    private UserRoleServiceImpl() {
        this.userRoleRepository = UserRoleRepositoryImpl.getUserRoleRepository();
    }

    public static UserRoleService getUserRoleService() {
        if (userRoleService == null) userRoleService = new UserRoleServiceImpl();
        return userRoleService;
    }

    @Override
    public UserRole create(UserRole userRole) {
        return this.userRoleRepository.create(userRole);
    }

    @Override
    public UserRole read(UserRole userRole) {
        return this.userRoleRepository.read(userRole);
    }

    @Override
    public UserRole update(UserRole userRole) {
        return this.userRoleRepository.update(userRole);
    }

    @Override
    public void delete(UserRole userRole) {
        this.userRoleRepository.delete(userRole);
    }

    @Override
    public Set<UserRole> getAll() {
        return this.userRoleRepository.getAll();
    }
}
