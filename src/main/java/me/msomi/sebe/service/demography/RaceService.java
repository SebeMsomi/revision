package me.msomi.sebe.service.demography;

import me.msomi.sebe.domain.demography.Race;
import me.msomi.sebe.service.IService;

import java.util.Set;

public interface RaceService extends IService<Race, String> {
    Set<Race> getAll();
}
