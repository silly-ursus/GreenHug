package com.umbrafox.greenhug;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ScheduleActivity extends AppCompatActivity {

    public void onClickClose(View view){
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
    }
}
