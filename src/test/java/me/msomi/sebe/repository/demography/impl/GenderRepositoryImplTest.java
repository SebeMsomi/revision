package me.msomi.sebe.repository.demography.impl;

import me.msomi.sebe.domain.demography.Gender;
import me.msomi.sebe.factory.demography.GenderFactory;
import me.msomi.sebe.repository.demography.GenderRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class GenderRepositoryImplTest {
    private GenderRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = GenderRepositoryImpl.genderRepository();
    }




    @Test
    public void create() {
        Gender gender = GenderFactory.buildGender("Male");
        repository.create(gender);

        Gender gender1 = repository.read(gender.getGenderId());
        Assert.assertNotNull(gender1);
        System.out.println("In create.... " + gender1);
    }

    @Test
    public void read() {
            Gender gender = GenderFactory.buildGender("Male");
            repository.create(gender);

            Gender gender1 = repository.read(gender.getGenderId());
            Assert.assertNotNull(gender1);

            System.out.println("In read.... " + gender1);
    }

    @Test
    public void update() {
            Gender gender = GenderFactory.buildGender("Male");
            repository.create(gender);

            Gender updated = GenderFactory.buildGender("Female");
            repository.update(updated);

            Assert.assertNotEquals(gender.getGenderDescription(),updated.getGenderDescription());
    }

    @Test
    public void delete() {
            Gender gender = GenderFactory.buildGender("Male");
            repository.create(gender);

            Gender gender1 = repository.read(gender.getGenderId());
            Assert.assertNotNull(gender1);
            repository.delete(gender.getGenderId());

            Gender deleted = repository.read(gender.getGenderId());
            Assert.assertNotNull(deleted);
    }

    @Test
    public void getAll() {
        Set<Gender> genderSet = repository.getAll();
        Assert.assertNotNull(genderSet);
        System.out.println("get all.... " + genderSet);
    }
}