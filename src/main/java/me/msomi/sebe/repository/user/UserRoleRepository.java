package me.msomi.sebe.repository.user;

import me.msomi.sebe.domain.user.UserRole;

import java.util.Set;

public interface UserRoleRepository {
    UserRole create(UserRole userRole);
    UserRole read(UserRole userRole);
    UserRole update(UserRole userRole);
    void delete(UserRole userRole);
    Set<UserRole> getAll();
}
