package com.logindemo.andriod.logindemo;

import android.text.Editable;

/**
 * Created by Amit on 22-09-2017.
 */

public class Info {

    public String name;
    public String uname;
    public String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    Info(String name, String uname, String password)
    {
        this.name=name;
        this.uname=uname;
        this.password=password;
    }

    Info()
    {

    }

}
