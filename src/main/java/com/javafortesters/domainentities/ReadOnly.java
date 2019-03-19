package com.javafortesters.domainentities;

import org.junit.Test;

public class ReadOnly extends User {

    /**
     *

    public ReadOnly() {
        this("readonlyuser", "password");
    }

    public ReadOnly(String username, String password) {
        super(username, password);
    }
    */

    @Override
    public String getPermission() {
        return "Read Only";
    }


}
