package com.jianwei_x.xvui.adapter;

import android.app.Application;
import android.content.res.Configuration;

import com.jianwei_x.xvui.utils.XvEnv;

/**
 * Created by jianwei-x on 4/11/2018.
 * <p>
 * <p>
 * -_-||
 */

public class XvBaseApp extends Application {

    private static XvBaseApp instance = null;

    @Override
    public void onCreate() {
        instance = this;
        super.onCreate();
        initXv();
    }


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }

    public static XvBaseApp getContext() {
        return instance;
    }

    private void initXv() {
        XvEnv.i().initParams();
        loadXvComponents();
    }

    private void loadXvComponents() {

    }
}
