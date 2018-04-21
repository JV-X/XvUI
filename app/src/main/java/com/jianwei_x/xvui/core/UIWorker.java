package com.jianwei_x.xvui.core;

import com.jianwei_x.xvui.utils.XvProcessor;

import java.util.TreeMap;

/**
 * Created by jianwei-x on 4/21/2018.
 * <p>
 * <p>
 * -_-||
 */

public class UIWorker {
    private static Thread worker = null;


    public static void init() {
        worker = XvProcessor.getThread(new XvWorkerTask());
        worker.start();
    }

    private static class XvWorkerTask implements Runnable {
        @Override
        public void run() {
            while (true) {

            }
        }
    }

}
