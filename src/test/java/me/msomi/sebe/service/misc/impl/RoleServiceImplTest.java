package me.msomi.sebe.service.misc.impl;

import me.msomi.sebe.domain.misc.Role;
import me.msomi.sebe.factory.misc.RoleFactory;
import me.msomi.sebe.service.misc.RoleService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class RoleServiceImplTest {
    private RoleService service;

    @Before
    public void setUp() throws  Exception
    {
        this.service = RoleServiceImpl.getRoleService();
    }

    @Test
    public void create() {
        Role role = RoleFactory.buildRole("Sebe");
        this.service.create(role);

        Role role1 = this.service.read(role.getRoleId());
        Assert.assertNotNull(role1);
    }

    @Test
    public void read() {
        Role role = RoleFactory.buildRole("Sebe");
        this.service.read(role.getRoleId());

        Assert.assertNotNull(role);
    }

    @Test
    public void update() {
        Role role = RoleFactory.buildRole("Sebe");
        this.service.create(role);

        Role role1 = RoleFactory.buildRole("Sebza");
        this.service.update(role1);

        Assert.assertNotEquals(role1.getRoleName(),role.getRoleName());
    }

    @Test
    public void delete() {
        Role role = RoleFactory.buildRole("Sebe");
        this.service.delete(role.getRoleName());
        Assert.assertNotNull(role);
    }

    @Test
    public void getAll() {
        Set<Role> roleSet = service.getAll();
        Assert.assertNotNull(roleSet);
    }
}