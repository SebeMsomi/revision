package me.msomi.sebe.repository.user;

import me.msomi.sebe.domain.user.UserDemography;
import me.msomi.sebe.repository.IRepository;

import java.util.Set;

public interface UserDemographyRepository extends IRepository<UserDemography, String> {
    @Override
    Set<UserDemography> getAll();
}
