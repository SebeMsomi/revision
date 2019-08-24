package me.msomi.sebe.factory.demography;

import me.msomi.sebe.domain.demography.Gender;
import org.junit.Assert;
import org.junit.Test;

public class GenderFactoryTest {

    @Test
    public void buildGender() {
        Gender gender = GenderFactory.buildGender("Male","F");

        Assert.assertNotNull(gender);
    }
}