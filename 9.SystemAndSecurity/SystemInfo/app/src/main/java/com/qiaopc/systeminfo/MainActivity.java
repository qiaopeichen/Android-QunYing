package com.qiaopc.systeminfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.text);
        String systemInfoStr = SystemInfoTools.getBuildInfo();
        systemInfoStr = SystemInfoTools.getBuildInfo();
        systemInfoStr += "-------------------------------\r\n";
        systemInfoStr += SystemInfoTools.getSystemPropertyInfo();
        textView.setText(systemInfoStr);
    }
}
