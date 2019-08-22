package me.msomi.sebe.repository.org.impl;

import me.msomi.sebe.domain.org.Organisation;
import me.msomi.sebe.repository.org.OrganisationRepository;

import java.util.HashSet;
import java.util.Set;

public class OrganisationRepositoryImpl implements OrganisationRepository {

    private Set<Organisation> organisationDB;
    private static OrganisationRepository organisationRepository = null;

    private OrganisationRepositoryImpl() {
        this.organisationDB = new HashSet<>();
    }

    public static OrganisationRepository getOrganisationRepository() {
        if (organisationRepository == null) organisationRepository = new OrganisationRepositoryImpl();
        return organisationRepository;
    }

    //TODO: Implement body
    @Override
    public Organisation create(Organisation organisation) {
       // throw new UnsupportedOperationException("Not supported yet.");
        organisationDB.add(organisation);
        return organisation;
    }

    //TODO: Implement body
    @Override
    public Organisation read(String orgCode) {
        return organisationDB.stream().filter(organisation -> orgCode.equalsIgnoreCase(orgCode)).findAny().orElse(null);
       // throw new UnsupportedOperationException("Not supported yet.");
    }

    //TODO: Implement body
    @Override
    public Organisation update(Organisation organisation) {
        //throw new UnsupportedOperationException("Not supported yet.");
        Organisation organisation1 = read(organisation.getOrgCode());
        if(organisation1 != null)
        {
            organisationDB.remove(organisation1);
            return create(organisation);
        }
        return null;
    }

    //TODO: Implement body
    @Override
    public void delete(String orgCode) {
       // throw new UnsupportedOperationException("Not supported yet.");
        Organisation organisation = read(orgCode);
        if(organisation != null)
        {
            organisationDB.remove(organisation);
        }
    }

    //TODO: Implement body
    @Override
    public Set<Organisation> getAll() {
        return organisationDB;
        //throw new UnsupportedOperationException("Not supported yet.");
    }
}
