package me.msomi.sebe.repository.user.impl;

import me.msomi.sebe.domain.user.UserDemography;
import me.msomi.sebe.repository.user.UserDemographyRepository;

import java.util.HashSet;
import java.util.Set;

public class UserDemographyRepositoryImpl implements UserDemographyRepository {

    private Set<UserDemography> userDemographyDB;
    private static UserDemographyRepository userDemographyRepository = null;

    private UserDemographyRepositoryImpl() {
        this.userDemographyDB = new HashSet<>();
    }

    public static UserDemographyRepository getUserDemographyRepository() {
        if (userDemographyRepository == null) userDemographyRepository = new UserDemographyRepositoryImpl();
        return userDemographyRepository;
    }

    //TODO: Implement body
    @Override
    public UserDemography create(UserDemography userDemography) {
        userDemographyDB.add(userDemography);
        return userDemography;
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    //TODO: Implement body
    @Override
    public UserDemography read(String userEmail) {
        return userDemographyDB.stream().filter(userDemography -> userEmail.equalsIgnoreCase(userDemography.getUserEmail())).findAny().orElse(null);
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    //TODO: Implement body
    @Override
    public UserDemography update(UserDemography userDemography) {
        UserDemography userDemography1 = read(userDemography.getUserEmail());
        if(userDemography1 != null)
        {
            userDemographyDB.remove(userDemography1);
            return create(userDemography1);
        }
        return null;
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    //TODO: Implement body
    @Override
    public void delete(String userEmail) {
        UserDemography userDemography = read(userEmail);
        if(userDemography != null)
        {
            userDemographyDB.remove(userDemography);
        }
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    //TODO: Implement body
    @Override
    public Set<UserDemography> getAll() {
        return userDemographyDB;
        //throw new UnsupportedOperationException("Not supported yet.");
    }
}
