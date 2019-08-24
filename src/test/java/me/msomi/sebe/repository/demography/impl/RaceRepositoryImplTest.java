package me.msomi.sebe.repository.demography.impl;

import me.msomi.sebe.domain.demography.Race;
import me.msomi.sebe.factory.demography.RaceFactory;
import me.msomi.sebe.repository.demography.RaceRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class RaceRepositoryImplTest {
    private RaceRepository raceRepository;
    private Race race;

    private Race getRace()
    {
        Set<Race> raceSet = this.raceRepository.getAll();
        return raceSet.iterator().next();
     //   return this.raceRepository.getAll().iterator().next();
    }
  //  private Race getRace1()

    @Before
    public void setUp() throws Exception
    {
        this.raceRepository = RaceRepositoryImpl.getRaceRepository();
        this.race = RaceFactory.buildRace("Blace","B");
    }

    @Test
    public void create() {
        Race race1 = this.raceRepository.create(this.race);
        System.out.println("In CREATE, CREATED.... " +  race1);
        getAll();
        Assert.assertSame(race1, this.race);
    }

    @Test
    public void read() {
        Race race1 = RaceFactory.buildRace("Black","B");
        this.raceRepository.create(race1);

        System.out.println("In READ, READ... " + race1.getRaceId());
        getAll();
        Assert.assertNotNull(race1);


    }

    @Test
    public void update() {
        String name = "White";
        Race updated = new Race.Builder().raceDescription(name).build();
        this.raceRepository.update(updated);
        System.out.println("In update, updated.... " + updated);
        Assert.assertSame(name, updated.getRaceDescription());

    }

    @Test
    public void delete() {
        Race race1 = getRace();
        this.raceRepository.delete(race1.getRaceId());
        Assert.assertNotNull(race1);
    }

    @Test
    public void getAll() {
        Set<Race> races = this.raceRepository.getAll();
        System.out.println("In Get ALL.... " + races);
    }
}