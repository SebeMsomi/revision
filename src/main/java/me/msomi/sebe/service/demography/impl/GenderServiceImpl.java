package me.msomi.sebe.service.demography.impl;

import me.msomi.sebe.domain.demography.Gender;
import me.msomi.sebe.repository.demography.GenderRepository;
import me.msomi.sebe.repository.demography.impl.GenderRepositoryImpl;
import me.msomi.sebe.service.demography.GenderService;

import java.util.Set;

public class GenderServiceImpl implements GenderService {

    private GenderRepository genderRepository;
    private static GenderService genderService = null;

    private GenderServiceImpl() {
        this.genderRepository = GenderRepositoryImpl.genderRepository();
    }

    public static GenderService getGenderService() {
        if (genderService == null) genderService = new GenderServiceImpl();
        return genderService;
    }

    @Override
    public Gender create(Gender d) {
        return this.genderRepository.create(d);
    }

    @Override
    public Gender read(String genderId) {
        return this.genderRepository.read(genderId);
    }

    @Override
    public Gender update(Gender gender) {
        return this.genderRepository.update(gender);
    }

    @Override
    public void delete(String genderId) {
        this.genderRepository.delete(genderId);
    }

    @Override
    public Set<Gender> getAll() {
        return this.genderRepository.getAll();
    }
}
