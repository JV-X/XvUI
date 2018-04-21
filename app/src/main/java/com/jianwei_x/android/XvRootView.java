package com.jianwei_x.android;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

import java.sql.Timestamp;

/**
 * Created by jianwei-x on 4/12/2018.
 * <p>
 * <p>
 * -_-||
 */

public class XvRootView extends FrameLayout {

    public XvRootView(@NonNull Context context) {
        super(context);
        init();
    }

    public XvRootView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public XvRootView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        //test code
        System.out.println("begin draw");
        final long begin = System.nanoTime();

        Paint p = new Paint();
        p.setColor(Color.BLACK);
        canvas.drawRect(0, 0, 200, 200, p);

        final  long end = System.nanoTime();
        System.out.println("end draw");
        System.out.println("use :" + (end - begin) + " ns");

        //        super.dispatchDraw(canvas);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        System.out.println("dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    public void init() {

    }
}