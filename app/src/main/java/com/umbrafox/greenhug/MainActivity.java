package com.umbrafox.greenhug;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void onClickSwitchActivity(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void onClickShowSchedule(View view){
        Intent intent = new Intent(this, ScheduleActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
