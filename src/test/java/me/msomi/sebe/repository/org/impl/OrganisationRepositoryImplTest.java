package me.msomi.sebe.repository.org.impl;

import me.msomi.sebe.domain.org.Organisation;
import me.msomi.sebe.factory.org.OrganisationFactory;
import me.msomi.sebe.repository.org.OrganisationRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class OrganisationRepositoryImplTest {
    private OrganisationRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = OrganisationRepositoryImpl.getOrganisationRepository();
    }

    @Test
    public void create() {
        Organisation organisation = OrganisationFactory.buildOrganisation("Amazon","1001");
        repository.create(organisation);

        Organisation organisation1 = repository.read(organisation.getOrgCode());
        Assert.assertNotNull(organisation1);

    }

    @Test
    public void read() {
        Organisation organisation = OrganisationFactory.buildOrganisation("Amazon","1001");
        this.repository.create(organisation);

        Organisation organisation1 = this.repository.read(organisation.getOrgCode());
        Assert.assertNotNull(organisation1);
    }

    @Test
    public void update() {
        Organisation organisation = OrganisationFactory.buildOrganisation("Amazon","1001");
        repository.create(organisation);

        Organisation updated = OrganisationFactory.buildOrganisation("FAcebook", "1002");
        this.repository.update(updated);

        Assert.assertNotEquals(updated.getOrgCode(),organisation.getOrgCode());
    }

    @Test
    public void delete() {
        Organisation organisation = OrganisationFactory.buildOrganisation("Facebook","1002");
        this.repository.delete(organisation.getOrgCode());
    }

    @Test
    public void getAll() {
        Set<Organisation> organisationSet = repository.getAll();
        Assert.assertNotNull(organisationSet);
    }
}