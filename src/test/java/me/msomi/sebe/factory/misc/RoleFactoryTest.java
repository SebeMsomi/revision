package me.msomi.sebe.factory.misc;

import me.msomi.sebe.domain.misc.Role;
import org.junit.Assert;
import org.junit.Test;

public class RoleFactoryTest {

    @Test
    public void buildRole() {
        Role role = RoleFactory.buildRole(" Programmer ");
        Assert.assertNotNull(role);

        System.out.println("The role is a " + role);
    }
}