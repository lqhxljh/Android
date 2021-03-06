package com.lqhx.learn.android.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.design.widget.FloatingActionButton;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

/**
 * Created by liaojinhua on 18-5-17.
 */

public class MyFloatingActionButton extends FloatingActionButton {
    String TAG = "MyFloatingActionButton";

    public MyFloatingActionButton(Context context) {
        this(context, null);
    }

    public MyFloatingActionButton(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyFloatingActionButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i(TAG, "dispatchTouchEvent ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i(TAG, "dispatchTouchEvent ACTION_MOVE");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.i(TAG, "dispatchTouchEvent ACTION_CANCEL");
                break;
            case MotionEvent.ACTION_UP:
                Log.i(TAG, "dispatchTouchEvent ACTION_UP");
                break;
        }
        return super.dispatchTouchEvent(event);
    }

    @SuppressLint("ClickableViewAccessibility")
    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i(TAG, "onTouchEvent ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i(TAG, "onTouchEvent ACTION_MOVE");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.i(TAG, "onTouchEvent ACTION_CANCEL");
                break;
            case MotionEvent.ACTION_UP:
                Log.i(TAG, "onTouchEvent ACTION_UP");
                break;
        }
        return super.onTouchEvent(ev);
    }
}
