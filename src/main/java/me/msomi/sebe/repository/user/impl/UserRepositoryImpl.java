package me.msomi.sebe.repository.user.impl;

import me.msomi.sebe.domain.user.User;
import me.msomi.sebe.repository.user.UserRepository;

import java.util.HashSet;
import java.util.Set;

public class UserRepositoryImpl implements UserRepository {

    private Set<User> userDB;
    private static UserRepository userRepository = null;

    private UserRepositoryImpl() {
        this.userDB = new HashSet<>();
    }

    public static UserRepository getUserRepository() {
        if (userRepository == null) userRepository = new UserRepositoryImpl();
        return userRepository;
    }

    //TODO: Implement body
    @Override
    public User create(User user) {
      this.userDB.add(user);
      return user;
    }

    //TODO: Implement body
    @Override
    public User read(String email) {
        return this.userDB.stream()
                .filter(user -> user.getUserEmail().trim()
                .equals(email)).findAny().orElse(null);
    }

    //TODO: Implement body
    @Override
    public User update(User user) {
        User user1 = read(user.getUserEmail());
        if(user1 != null)
        {
            this.userDB.remove(user1);
            return create(user);
        }
       return null;
    }

    //TODO: Implement body
    @Override
    public void delete(String email) {
        User user = read(email);
        if(user != null)
        this.userDB.remove(user);

    }

    //TODO: Implement body
    @Override
    public Set<User> getAll() {
        return this.userDB;
    }
}
