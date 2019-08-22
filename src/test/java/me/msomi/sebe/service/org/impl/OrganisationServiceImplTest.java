package me.msomi.sebe.service.org.impl;

import me.msomi.sebe.domain.org.Organisation;
import me.msomi.sebe.factory.org.OrganisationFactory;
import me.msomi.sebe.service.org.OrganisationService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class OrganisationServiceImplTest {
    private OrganisationService service;

    @Before
    public void setUp() throws Exception
    {
        this.service = OrganisationServiceImpl.getOrganisationService();
    }

    @Test
    public void create() {
        Organisation organisation = OrganisationFactory.buildOrganisation("Amazon","101");
        this.service.create(organisation);

        Organisation organisation1 = this.service.read(organisation.getOrgCode());
        Assert.assertNotNull(organisation1);

    }

    @Test
    public void read() {
        Organisation organisation = OrganisationFactory.buildOrganisation("Amazon", "101");
        this.service.create(organisation);

        Organisation organisation1 = this.service.read(organisation.getOrgCode());
        Assert.assertNotNull(organisation1);
    }

    @Test
    public void update() {
        Organisation organisation =  OrganisationFactory.buildOrganisation("Amazon","101");
        this.service.create(organisation);

        Organisation organisation1 = OrganisationFactory.buildOrganisation("Microsoft","102");
        this.service.update(organisation1);

        Assert.assertNotEquals(organisation.getOrgName(),organisation1.getOrgName());
    }

    @Test
    public void delete() {
        Organisation organisation = OrganisationFactory.buildOrganisation("Microsoft", "102");
        this.service.delete(organisation.getOrgName());
        Assert.assertNotNull(organisation);
    }

    @Test
    public void getAll() {
        Set<Organisation> organisations = service.getAll();
        Assert.assertNotNull(organisations);
    }
}