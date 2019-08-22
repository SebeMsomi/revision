package me.msomi.sebe.factory.org;

import me.msomi.sebe.domain.org.Organisation;

public class OrganisationFactory {

    //TODO: Implement body.
    public static Organisation buildOrganisation(String organisationName, String orgCode) {
       // throw new UnsupportedOperationException("Not supported yet.");
        return new Organisation.Builder().orgName(organisationName)
                .orgCode(orgCode)
                .build();
    }


}
