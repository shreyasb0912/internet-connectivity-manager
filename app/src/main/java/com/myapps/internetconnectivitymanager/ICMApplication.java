package com.myapps.internetconnectivitymanager;

import android.app.Application;

public class ICMApplication extends Application {

    private static ICMApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static synchronized ICMApplication getInstance(){
        return instance;
    }

    public void setConnectivityListener(ConnectivityReceiver.ConnectivityListener connectivityListener){
        ConnectivityReceiver.connectivityListener = connectivityListener;
    }
}
