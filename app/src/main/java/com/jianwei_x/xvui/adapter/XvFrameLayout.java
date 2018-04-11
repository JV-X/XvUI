package com.jianwei_x.xvui.adapter;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/**
 * Created by jianwei-x on 4/12/2018.
 * <p>
 * <p>
 * -_-||
 */

public class XvFrameLayout extends FrameLayout {

    public XvFrameLayout(@NonNull Context context) {
        super(context);
        init();
    }

    public XvFrameLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public XvFrameLayout(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        System.out.println("dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    public void init() {

    }
}