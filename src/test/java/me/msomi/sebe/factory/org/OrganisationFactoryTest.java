package me.msomi.sebe.factory.org;

import me.msomi.sebe.domain.org.Organisation;
import org.junit.Assert;
import org.junit.Test;

public class OrganisationFactoryTest {

    @Test
    public void buildOrganisation() {
        Organisation organisation = OrganisationFactory.buildOrganisation("Amazon","2112");
        Assert.assertNotNull(organisation);
        System.out.println(organisation);
    }
}