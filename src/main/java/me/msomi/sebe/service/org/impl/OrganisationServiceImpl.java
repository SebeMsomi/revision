package me.msomi.sebe.service.org.impl;

import me.msomi.sebe.domain.org.Organisation;
import me.msomi.sebe.repository.org.OrganisationRepository;
import me.msomi.sebe.service.org.OrganisationService;

import java.util.Set;

public class OrganisationServiceImpl implements OrganisationService {

    private OrganisationRepository organisationRepository;
    private static OrganisationService organisationService = null;

    private OrganisationServiceImpl() {
        this.organisationRepository = null;
    }

    public static OrganisationService getOrganisationService() {
        if (organisationService == null) organisationService = new OrganisationServiceImpl();
        return organisationService;
    }

    @Override
    public Organisation create(Organisation d) {
        return this.organisationRepository.create(d);
    }

    @Override
    public Organisation read(String orgCode) {
        return this.organisationRepository.read(orgCode);
    }

    @Override
    public Organisation update(Organisation organisation) {
        return this.organisationRepository.update(organisation);
    }

    @Override
    public void delete(String orgCode) {
        this.organisationRepository.delete(orgCode);
    }

    @Override
    public Set<Organisation> getAll() {
        return this.organisationRepository.getAll();
    }
}
