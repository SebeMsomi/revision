package me.msomi.sebe.repository.org;

import me.msomi.sebe.domain.org.OrganisationUser;

import java.util.Set;

public interface OrganisationUserRepository {
    OrganisationUser create(OrganisationUser organisationUser);
    OrganisationUser read(String orgCode, String userEmail);
    OrganisationUser update(OrganisationUser organisationUser);
    void delete(String orgCode, String userEmail);
    Set<OrganisationUser> getAll();
}
