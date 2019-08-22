package me.msomi.sebe.repository.demography;

import me.msomi.sebe.domain.demography.Race;
import me.msomi.sebe.repository.IRepository;

import java.util.Set;

public interface RaceRepository extends IRepository<Race, String> {
    Set<Race> getAll();
}
