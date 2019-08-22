package me.msomi.sebe.repository.misc.impl;

import me.msomi.sebe.domain.misc.Role;
import me.msomi.sebe.factory.misc.RoleFactory;
import me.msomi.sebe.repository.misc.RoleRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class RoleRepositoryImplTest {
    private RoleRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = RoleRepositoryImpl.getRoleRepository();
    }

    @Test
    public void create() {
        Role role = RoleFactory.buildRole("Sebza");
        repository.create(role);

        Role role1 = repository.read(role.getRoleId());
        Assert.assertNotNull(role1);
    }

    @Test
    public void read() {
        Role role = RoleFactory.buildRole("Sebza");
        repository.create(role);

        Role role1 = repository.read(role.getRoleId());
        Assert.assertNotNull(role1);
    }

    @Test
    public void update() {
        Role role = RoleFactory.buildRole("Sebza");
        repository.create(role);

        Role updated = RoleFactory.buildRole("Sebe");
        repository.update(updated);

        Assert.assertNotEquals(updated,role);

    }

    @Test
    public void delete() {
        Role role = RoleFactory.buildRole("Sebe");
        repository.delete(role.getRoleId());
    }

    @Test
    public void getAll() {
        Set<Role> roleSet = repository.getAll();
        Assert.assertNotNull(roleSet);
    }
}