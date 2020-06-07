package com.ljh.process.memory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ljh.process.R;
import com.ljh.process.memory.utils.MyConstant;

public class ProcessMenuActivity extends Activity {
    private final String TAG = "ProcessMenuActivity";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process_menu);
        initView();
    }

    /**
     * 初始化View并切显示当前Process ID
     */
    private void initView() {
        TextView tv_process = findViewById(R.id.tv_process_id);
        tv_process.setText(String.format(getString(R.string.show_application_id), Process.myPid()));
        Button btnMemory = findViewById(R.id.btn_memory);
        btnMemory.setOnClickListener(v -> onMemoryClick(v));
        MyConstant.setConstant(0);
        Log.i(TAG,"constant :"+ MyConstant.MY_CONSTANT);
    }

    public void onMemoryClick(View view) {
        startActivity(new Intent(this, ProcessMemoryActivity.class));
    }
}
