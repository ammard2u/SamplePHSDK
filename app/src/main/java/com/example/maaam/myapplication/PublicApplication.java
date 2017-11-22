package com.example.maaam.myapplication;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import my.doctor2u.Doctor2uSdk;
import my.doctor2u.Doctor2uSdkBuilder;

/**
 * Created by maaam on 11/10/2017.
 */

public class PublicApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Doctor2uSdkBuilder
                .withApplication(this, "")
                .setCountry(Doctor2uSdk.Country.PHILIPPINES)
                .setDebug(true)
                .setHasEcommerce(false)
                .setHasProfile(true)
                .initialize();

    }

    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
