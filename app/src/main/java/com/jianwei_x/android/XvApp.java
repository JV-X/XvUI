package com.jianwei_x.android;

import android.app.Application;
import android.content.res.Configuration;

import com.jianwei_x.xv.utils.XvEnv;

/**
 * Created by jianwei-x on 4/11/2018.
 * <p>
 * <p>
 * -_-||
 */

public class XvApp extends Application {

    private static XvApp instance = null;

    private static XvRootView rootView = null;

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

    public static XvApp getContext() {
        return instance;
    }

    public static XvRootView getRootView() {
        return rootView;
    }

    private void initXv() {
        XvEnv.i().initParams();

        rootView = new XvRootView(this);

        loadXvComponents();
    }

    private void loadXvComponents() {

    }
}
