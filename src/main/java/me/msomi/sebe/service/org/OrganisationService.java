package me.msomi.sebe.service.org;

import me.msomi.sebe.domain.org.Organisation;
import me.msomi.sebe.service.IService;

import java.util.Set;

public interface OrganisationService extends IService<Organisation, String> {
    @Override
    Set<Organisation> getAll();
}
