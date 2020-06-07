package com.ljh.process.memory;

import android.app.ActivityManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.ljh.process.R;


public class ProcessMemoryActivity extends AppCompatActivity implements View.OnClickListener {
    private String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process_memory);
        AppCompatButton fab = findViewById(R.id.btn_memory);
        fab.setOnClickListener(this);


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_memory) {
            onMemoryClick();
            Log.e(TAG, "onClick ");
        }
        return;
    }

    /**
     * 1.通过Activity 获取memory大小
     * <p>
     * 2.Runtime获取内存大小
     */
    private void onMemoryClick() {
        StringBuilder stringBuilder = new StringBuilder("");
        ActivityManager manager = (ActivityManager) getSystemService(ACTIVITY_SERVICE);
        if (manager != null) {
            ActivityManager.MemoryInfo info = new ActivityManager.MemoryInfo();
            manager.getMemoryInfo(info);
            stringBuilder.append(String.format(getString(R.string.phone_memory), info.availMem / 1024,
                    info.totalMem, info.threshold));

        }
        stringBuilder.append("\n\n");
        Runtime runtime = Runtime.getRuntime();
        stringBuilder.append(String.format(getString(R.string.app_memory), runtime.freeMemory() / 1024 / 1024,
                runtime.totalMemory() / 1024 / 1024, runtime.maxMemory() / 1024 / 1024));
        TextView textView = findViewById(R.id.tv_memory_info);
        textView.setText(stringBuilder.toString());

    }


}
