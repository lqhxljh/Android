package com.lqhx.learn.android;

import android.app.Application;
import android.util.Log;

public class MyApplication extends Application {
    private final String TAG = "MyApplication";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e(TAG, String.format(getString(R.string.show_application_id), android.os.Process.myPid()));

    }
}
