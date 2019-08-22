package me.msomi.sebe.service.org.impl;

import me.msomi.sebe.domain.org.OrganisationUser;
import me.msomi.sebe.repository.org.OrganisationUserRepository;
import me.msomi.sebe.repository.org.impl.OrganisationUserRepositoryImpl;
import me.msomi.sebe.service.org.OrganisationUserService;

import java.util.Set;

public class OrganisationUserServiceImpl implements OrganisationUserService {

    private OrganisationUserRepository organisationUserRepository;
    private static OrganisationUserService organisationUserService = null;

    private OrganisationUserServiceImpl() {
        this.organisationUserRepository = OrganisationUserRepositoryImpl.getOrganisationUserRepository();
    }

    public OrganisationUserService getOrganisationUserService() {
        if (organisationUserService == null) organisationUserService = new OrganisationUserServiceImpl();
        return organisationUserService;
    }

    @Override
    public OrganisationUser create(OrganisationUser organisationUser) {
        return this.organisationUserRepository.create(organisationUser);
    }

    @Override
    public OrganisationUser read(String orgCode, String userEmail) {
        return this.organisationUserRepository.read(orgCode, userEmail);
    }

    @Override
    public OrganisationUser update(OrganisationUser organisationUser) {
        return this.organisationUserRepository.update(organisationUser);
    }

    @Override
    public void delete(String orgCode, String userEmail) {
        this.organisationUserRepository.delete(orgCode, userEmail);
    }

    @Override
    public Set<OrganisationUser> getAll() {
        return this.organisationUserRepository.getAll();
    }
}
