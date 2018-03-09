package com.example.root.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class activity_result extends AppCompatActivity {
    TextView tv;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tv = (TextView)findViewById(R.id.tv);
        result=getIntent().getExtras().getString("name");
        tv.setText(result);
    }
}
