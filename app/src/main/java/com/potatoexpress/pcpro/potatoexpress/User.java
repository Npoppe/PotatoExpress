package com.potatoexpress.pcpro.potatoexpress;

/**
 * Created by PcPro on 22-9-2015.
 */
public class User {
    String name, username, password, email;

    public User(String name, String username, String password, String email) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.email = "NoEmail@email.null";
        this.name = "NoNameGiven";
    }

}
