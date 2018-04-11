package com.jianwei_x.xvui.utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

/**
 * Created by jianwei-x on 4/12/2018.
 * <p>
 * <p>
 * -_-||
 */

public class IOUtils {

    public static String read(InputStream in) {
        Scanner s = new Scanner(in).useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }
}
