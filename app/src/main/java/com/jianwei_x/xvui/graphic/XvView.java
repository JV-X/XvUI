package com.jianwei_x.xvui.graphic;

import com.jianwei_x.xvui.utils.XvEnv;

/**
 * Created by jianwei-x on 4/11/2018.
 * <p>
 * <p>
 * -_-||
 */

public class XvView {

    protected int width(int designWidth) {
        return designWidth / XvEnv.DESIGN_SCREEN_WIDTH * XvEnv.SCREEN_WIDTH;
    }

    protected int height(int designHeight) {
        return designHeight / XvEnv.DESIGN_SCREEN_HEIGHT * XvEnv.SCREEN_HEIGHT;
    }
}
