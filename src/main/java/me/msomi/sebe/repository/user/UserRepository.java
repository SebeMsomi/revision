package me.msomi.sebe.repository.user;

import me.msomi.sebe.domain.user.User;
import me.msomi.sebe.repository.IRepository;

import java.util.Set;

public interface UserRepository extends IRepository<User, String> {
    Set<User> getAll();
}
