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
    private Gender gender;

    private Gender getGender()
    {
        Set<Gender> genders = this.repository.getAll();
        return genders.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = GenderRepositoryImpl.genderRepository();
        this.gender = GenderFactory.buildGender("Male", "M");
    }




    @Test
    public void create() {
      Gender gender1 = this.repository.create(this.gender);
      System.out.println("In Create, " + gender1);
      getAll();
      Assert.assertSame(gender1, this.gender);

    }

    @Test
    public void read() {
        Gender gender1 = GenderFactory.buildGender("Male","M");
        this.repository.create(gender1);

        System.out.println("In Read, Read... " + gender1.getGenderId());

       // Gender gender2 = this.repository.read(gender1.getGenderId());
        Assert.assertNotNull(gender1);
        getAll();

    }
    @Test
    public void update() {
            String newname = "Female";
            Gender updated = new Gender.Builder().genderDescription(newname).build();
            this.repository.update(updated);
            System.out.println("In update, Updated..." + updated.getGenderDescription());
            getAll();
    }

    @Test
    public void delete() {
        Gender gender1 = getGender();
        this.repository.delete(gender1.getGenderId());
        Assert.assertNotNull(gender1);
        getAll();

    }

    @Test
    public void getAll() {
        Set<Gender> all = this.repository.getAll();
        System.out.println("In GET ALL, ALL " + all);
    }
}