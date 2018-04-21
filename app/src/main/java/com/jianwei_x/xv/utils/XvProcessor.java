package com.jianwei_x.xv.utils;

/**
 * Created by jianwei-x on 4/14/2018.
 * <p>
 * <p>
 * -_-||
 */

public class XvProcessor {


    // TODO:代码里统一从这里获取线程资源，以后再加控制逻辑

    public static Thread getThread(Runnable task) {
        return new Thread(task);  //暂时先这样
    }
}
