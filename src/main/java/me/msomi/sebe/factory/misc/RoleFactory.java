package me.msomi.sebe.factory.misc;

import me.msomi.sebe.domain.misc.Role;

public class RoleFactory {

    //TODO: Implement body
    public static Role buildRole(String roleName, String roleId) {
        return new Role.Builder().roleName(roleName)
                .roleId(roleId)
                .build();
       // throw new UnsupportedOperationException("Not supported yet.");
    }
}
