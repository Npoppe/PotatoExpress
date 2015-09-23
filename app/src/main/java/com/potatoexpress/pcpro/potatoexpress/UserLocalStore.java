package com.potatoexpress.pcpro.potatoexpress;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by PcPro on 22-9-2015.
 */
public class UserLocalStore {
    public static final String SP_NAME = "userDetails";
    SharedPreferences userLocalDatabase;

    public UserLocalStore(Context context) {
        userLocalDatabase = context.getSharedPreferences(SP_NAME, 0);
    }

    public void storeUserData(User user) {
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.putString("name", user.name);
        spEditor.putString("username", user.username);
        spEditor.putString("email", user.email);
        spEditor.putString("password", user.password);

        spEditor.commit();


    }

    public User getLoggedInUser() {
        String name = userLocalDatabase.getString("name", "");
        String username = userLocalDatabase.getString("username", "");
        String password = userLocalDatabase.getString("password", "");
        String email = userLocalDatabase.getString("email", "NoEmail@email.null");

        User storedUser = new User(name, username, email, password);

        return storedUser;

    }


    public void setUserLoggedIn(boolean loggedIn)
    {
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.putBoolean("loggedIn",loggedIn);
        spEditor.commit();
    }
    public void clearUserData()
    {
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.clear();
        spEditor.commit();
    }
}
