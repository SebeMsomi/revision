package me.msomi.sebe.service.demography.impl;

import me.msomi.sebe.domain.demography.Race;
import me.msomi.sebe.factory.demography.RaceFactory;
import me.msomi.sebe.service.demography.RaceService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class RaceServiceImplTest {
    private RaceService service;

    @Before
    public void setUp() throws Exception
    {
        this.service = RaceServiceImpl.getRaceService();
    }

    @Test
    public void create() {
        Race race = RaceFactory.buildRace("Black");
        service.create(race);
        Race race1 = service.read(race.getRaceId());
        Assert.assertNotNull(race1);
    }

    @Test
    public void read() {
        Race race = RaceFactory.buildRace("Black");
        service.create(race);
        Race race1 = service.read(race.getRaceId());
        Assert.assertNotNull(race1);
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
        Race race = RaceFactory.buildRace("Black");
        service.create(race);
        Race race1 = service.read(race.getRaceId());
        Assert.assertNotNull(race1);
        service.delete(race.getRaceId());

        Race race2 = service.read(race.getRaceId());
        Assert.assertNotNull(race2);

    }

    @Test
    public void getAll() {
        Set<Race> raceSet = service.getAll();
        Assert.assertNotNull(raceSet);
    }
}