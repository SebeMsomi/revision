package me.msomi.sebe.repository.org;

import me.msomi.sebe.domain.org.Organisation;
import me.msomi.sebe.repository.IRepository;

import java.util.Set;

public interface OrganisationRepository extends IRepository<Organisation, String> {
    Set<Organisation> getAll();
}
