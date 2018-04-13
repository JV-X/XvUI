package com.jianwei_x.xvui.graphic.view;

import com.jianwei_x.xvui.utils.XvEnv;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jianwei-x on 4/11/2018.
 * <p>
 * <p>
 * -_-||
 */

public class XvView {


    private XvView parent = null;
    private ArrayList<XvView> childrens = null;

    private int left = -1;
    private int top = -1;
    private int right = -1;
    private int buttom = -1;

    public enum ViewType {

    }

    protected static int width(int designWidth) {
        return designWidth / XvEnv.DESIGN_SCREEN_WIDTH * XvEnv.SCREEN_WIDTH;
    }

    protected static int height(int designHeight) {
        return designHeight / XvEnv.DESIGN_SCREEN_HEIGHT * XvEnv.SCREEN_HEIGHT;
    }


}
