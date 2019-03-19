package com.javafortesters.chap12introducinginheritance.examples;

import com.javafortesters.domainentities.AdminUser;
import com.javafortesters.domainentities.EnvironmentUser;
import com.javafortesters.domainentities.ReadOnly;
import com.javafortesters.domainentities.User;
import com.javafortesters.domainobject.TestAppEnv;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmptyUserTest extends User {

    @Test
    public void emptyUserExampleTest() {
        EmptyUserTest emu = new EmptyUserTest();
        assertEquals("username", emu.getUsername());
        assertEquals("password", emu.getPassword());
    }


    @Test
    public void environmentUserExample() {
        EnvironmentUser envuser = new EnvironmentUser();
        assertEquals("username", envuser.getUsername());
        assertEquals("http://192.123.0.3:67", TestAppEnv.getUrl());
    }

    @Test
    public void adminUserDefaultConstructor() {
        AdminUser adminUser = new AdminUser();
        assertEquals("adminuser", adminUser.getUsername());
        assertEquals("password", adminUser.getPassword());
        assertEquals("Elevated", adminUser.getPermission());
    }

    @Test
    public void adminUserHasElevatedPermissions() {
        AdminUser adminUser = new AdminUser("admin", "password");
        assertEquals("admin", adminUser.getUsername());
        assertEquals("password", adminUser.getPassword());
        assertEquals("Elevated", adminUser.getPermission());
    }

    @Test
    public void readOnlyUserDefaultConstructor() {
        ReadOnly readOnly = new ReadOnly();
        assertEquals("username", readOnly.getUsername());
        assertEquals("password", readOnly.getPassword());
        assertEquals("Read Only", readOnly.getPermission());
    }

}
