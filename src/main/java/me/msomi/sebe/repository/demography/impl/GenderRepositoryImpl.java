package me.msomi.sebe.repository.demography.impl;

import me.msomi.sebe.domain.demography.Gender;
import me.msomi.sebe.repository.demography.GenderRepository;

import java.util.HashSet;
import java.util.Set;

public class GenderRepositoryImpl implements GenderRepository {

    private static GenderRepository genderRepository = null;
    private Set<Gender> genderDB;

    private GenderRepositoryImpl() {
        this.genderDB = new HashSet<>();
    }

    public static GenderRepository genderRepository() {
        if (genderRepository == null) genderRepository = new GenderRepositoryImpl();
        return genderRepository;
    }

    @Override
    public Set<Gender> getAll(){

        return genderDB;

    }

    @Override
    public Gender create(Gender gender) {

        genderDB.add(gender);
        return gender;
    }

    @Override
    public Gender read(String id) {
        return genderDB.stream().filter(gender -> gender.getGenderId() == id).findAny().orElse(null);


    }

    @Override
    public Gender update(Gender gender) {

        Gender genderToDelete = read(gender.getGenderId());

        if(genderToDelete != null) {
            genderDB.remove(genderToDelete);
            return create(gender);
        }
        return null;

    }

    @Override
    public void delete(String id) {

        Gender genderToDelete = read(id);

        if(genderToDelete != null) {
            genderDB.remove(genderToDelete);
        }

    }
}
