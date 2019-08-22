package me.msomi.sebe.service.demography.impl;

import me.msomi.sebe.domain.demography.Race;
import me.msomi.sebe.repository.demography.RaceRepository;
import me.msomi.sebe.repository.demography.impl.RaceRepositoryImpl;
import me.msomi.sebe.service.demography.RaceService;

import java.util.Set;

public class RaceServiceImpl implements RaceService {

    private RaceRepository raceRepository;
    private static RaceService raceService = null;

    private RaceServiceImpl() {
        this.raceRepository = RaceRepositoryImpl.getRaceRepository();
    }

    public static RaceService getRaceService() {
        if (raceService == null) raceService = new RaceServiceImpl();
        return raceService;
    }

    @Override
    public Race create(Race d) {
        return this.raceRepository.create(d);
    }

    @Override
    public Race read(String raceId) {
        return this.raceRepository.read(raceId);
    }

    @Override
    public Race update(Race race) {
        return this.raceRepository.update(race);
    }

    @Override
    public void delete(String raceId) {
        this.raceRepository.delete(raceId);
    }

    @Override
    public Set<Race> getAll() {
        return this.raceRepository.getAll();
    }
}
