package me.msomi.sebe.service.demography;

import me.msomi.sebe.domain.demography.Gender;
import me.msomi.sebe.service.IService;

import java.util.Set;

public interface GenderService extends IService<Gender, String> {
    @Override
    Set<Gender> getAll();
}
