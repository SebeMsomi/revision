package me.msomi.sebe.repository.demography;

import me.msomi.sebe.domain.demography.Gender;
import me.msomi.sebe.repository.IRepository;

import java.util.Set;

public interface GenderRepository extends IRepository<Gender, String> {
    Set<Gender> getAll();
}
