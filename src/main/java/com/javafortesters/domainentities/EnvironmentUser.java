package com.javafortesters.domainentities;

import com.javafortesters.domainobject.TestAppEnv;

public class EnvironmentUser extends User {

    public String getUrl() {
        return TestAppEnv.getUrl();
    }

}
