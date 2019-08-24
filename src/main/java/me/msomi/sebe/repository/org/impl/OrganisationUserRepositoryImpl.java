package me.msomi.sebe.repository.org.impl;

import me.msomi.sebe.domain.org.OrganisationUser;
import me.msomi.sebe.repository.org.OrganisationUserRepository;

import java.util.HashSet;
import java.util.Set;

public class OrganisationUserRepositoryImpl implements OrganisationUserRepository {

    private Set<OrganisationUser> organisationUserDB;
    private static OrganisationUserRepository organisationUserRepository = null;

    private OrganisationUserRepositoryImpl() {
        this.organisationUserDB = new HashSet<>();
    }

    public static OrganisationUserRepository getOrganisationUserRepository() {
        if (organisationUserRepository == null) organisationUserRepository = new OrganisationUserRepositoryImpl();
        return organisationUserRepository;
    }

    //TODO: Implement body
    @Override
    public OrganisationUser create(OrganisationUser organisationUser) {
        //throw new UnsupportedOperationException("Not supported yet.");
        organisationUserDB.add(organisationUser);
        return organisationUser;
    }

    //TODO: Implement body
    @Override
    public OrganisationUser read(String orgCode, String userEmail) {
      //  throw new UnsupportedOperationException("Not supported yet.");
        return organisationUserDB.stream().filter(organisationUser -> orgCode.equalsIgnoreCase(orgCode))
                .findAny().orElse(null);
    }

    //TODO: Implement body
    @Override
    public OrganisationUser update(OrganisationUser organisationUser) {
        throw new UnsupportedOperationException("Not supported yet.");

    }

    //TODO: Implement body
    @Override
    public void delete(String orgCode, String userEmail) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //TODO: Implement body
    @Override
    public Set<OrganisationUser> getAll() {
        return organisationUserDB;
       // throw new UnsupportedOperationException("Not supported yet.");
    }


}
