package me.msomi.sebe.service.demography.impl;

import me.msomi.sebe.domain.demography.Gender;
import me.msomi.sebe.factory.demography.GenderFactory;
import me.msomi.sebe.service.demography.GenderService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class GenderServiceImplTest {
    private GenderService service;

    @Before
    public void setUp() throws Exception
    {
        this.service = GenderServiceImpl.getGenderService();
    }

    @Test
    public void create() {
        Gender gender = GenderFactory.buildGender("Male", "F");
        service.create(gender);

        Gender gender1 = service.read(gender.getGenderId());
        Assert.assertNotNull(gender1);
    }

    @Test
    public void read() {
        Gender gender = GenderFactory.buildGender("Male", "M");
        service.create(gender);
        Gender gender1 = service.read(gender.getGenderId());
        Assert.assertNotNull(gender1);
    }

    @Test
    public void update() {
        Gender gender = GenderFactory.buildGender("Male", "M");
        service.create(gender);

        Gender gender1 = service.read(gender.getGenderId());;
       Assert.assertNotNull(gender1);
    }

    @Test
    public void delete() {
        Gender gender = GenderFactory.buildGender("Male","M");
        service.create(gender);
        Gender gender1 = service.read(gender.getGenderId());
        Assert.assertNotNull(gender1);
        service.delete(gender.getGenderId());
    }

    @Test
    public void getAll() {
        Set<Gender> genderSet = service.getAll();
        Assert.assertNotNull(genderSet);
    }
}