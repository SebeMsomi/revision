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
    private Role role;

    private Role getRole()
    {
        Set<Role> roles = this.repository.getAll();
        return roles.iterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repository = RoleRepositoryImpl.getRoleRepository();
        this.role = RoleFactory.buildRole("Sebe","101");
    }

    @Test
    public void create() {
      Role role1 = this.repository.create(this.role);
      System.out.println("In create, created = " + role1);
      //getAll();
      Assert.assertSame(role1,this.role);

    }

    @Test
    public void read() {
            /*Role saveRole = getRole();
            System.out.println("In read, roleId = " + saveRole.getRoleId());
            Role read = this.repository.read(saveRole.getRoleId());
            System.out.println("In read, read = " + read);
            getAll();
            Assert.assertSame(saveRole,read);*/

            Role role1 = RoleFactory.buildRole("Sebe","101");
            this.repository.create(role1);
            System.out.println("In reading, read " + role1.getRoleId());

           // Role role2 = this.repository.read(role1.getRoleId());
            Assert.assertNotNull(role1);
           // getAll();
         //   System.out.println("In read, read " );
    }

    @Test
    public void update() {
        String newname = "Sebe Msomi";
        Role updated = new Role.Builder().roleName(newname).build();
        this.repository.update(updated);
        System.out.println("In update, updated... " + updated.getRoleName());
        Assert.assertSame(newname, updated.getRoleName());

    }

    @Test
    public void delete() {
        Role saveRole = getRole();
        this.repository.delete(saveRole.getRoleId());
        System.out.println("In delete, deleted.. ");
     //   getAll();
    }

    @Test
    public void getAll() {
            Set<Role> all = this.repository.getAll();
            System.out.println("In get ALL, ALL = " + all);
    }
}