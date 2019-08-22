package me.msomi.sebe.repository.demography.impl;

import me.msomi.sebe.domain.demography.Race;
import me.msomi.sebe.repository.demography.RaceRepository;

import java.util.HashSet;
import java.util.Set;

public class RaceRepositoryImpl implements RaceRepository {

    private Set<Race> raceDB;
    private static RaceRepository raceRepository = null;

    private RaceRepositoryImpl() {
        this.raceDB = new HashSet<>();
    }

    public static RaceRepository getRaceRepository() {
        if (raceRepository == null) raceRepository = new RaceRepositoryImpl();
        return raceRepository;
    }
    @Override
    public Race create(Race race) {
        raceDB.add(race);
        return race;
    }

    @Override
    public Race read(String id) {

        return raceDB.stream().filter(race -> race.getRaceId() == id).findAny().orElse(null);
    }

    @Override
    public Race update(Race race) {

        Race raceToDelete = read(race.getRaceId());

        if(raceToDelete != null) {
            raceDB.remove(raceToDelete);
            return create(race);
        }
        return null;
    }

    @Override
    public void delete(String id) {
        Race raceToDelete = read(id);

        if(raceToDelete != null) {
            raceDB.remove(raceToDelete);
        }
    }


    @Override
    public Set<Race> getAll() {
        return raceDB;
    }
}
