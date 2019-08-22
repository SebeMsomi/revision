package me.msomi.sebe.factory.demography;

import me.msomi.sebe.domain.demography.Race;
import org.junit.Assert;
import org.junit.Test;

public class RaceFactoryTest {

    @Test
    public void buildRace() {
        Race race = RaceFactory.buildRace("Black");

        Assert.assertNotNull(race);
        System.out.println("The race is: " + race );
    }
}