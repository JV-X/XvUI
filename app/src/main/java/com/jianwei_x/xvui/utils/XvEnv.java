package com.jianwei_x.xvui.utils;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;

import com.jianwei_x.xvui.XvApp;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by jianwei-x on 4/11/2018.
 * <p>
 * <p>
 * -_-||
 */

public class XvEnv {
    private static final String TAG = XvEnv.class.getSimpleName();

    public static int SCREEN_WIDTH;
    public static int SCREEN_HEIGHT;

    public static int DESIGN_SCREEN_WIDTH = 1440;
    public static int DESIGN_SCREEN_HEIGHT = 2560;

    private XvEnv() {
    }

    private static class Holder {
        private static XvEnv instance = new XvEnv();
    }

    public static XvEnv i() {
        return Holder.instance;
    }


    public void initParams() {
        initScreenSize();
        initCPUInfo();
        initMemorySize();
    }

    private void initMemorySize() {

    }

    private void initScreenSize() {
        WindowManager wm = (WindowManager) XvApp.getContext().getSystemService(Context.WINDOW_SERVICE);

        if (wm == null) {
            Log.d(TAG, "get display failed");
            return;
        }

        Display display = wm.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getMetrics(displayMetrics);

        SCREEN_HEIGHT = displayMetrics.heightPixels;
        SCREEN_WIDTH = displayMetrics.widthPixels;
    }


    private void initCPUInfo() {
        String s = "";

        try {
            Process p = new ProcessBuilder("/system/bin/cat", "/proc/cpuinfo").start();

            InputStream in = p.getInputStream();

            s = IOUtils.read(in);

            in.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        Log.d(TAG, "CPU INFO : " + s); // TODO
    }
}
