package com.umbrafox.greenhug;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ScheduleActivity extends AppCompatActivity {

    public void onClickClose(View view){
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        ((TextView)findViewById(R.id.textViewState)).setText("onCreate()\n");
    }

    @Override
    protected void onStart(){
        super.onStart();
        ((TextView)findViewById(R.id.textViewState)).append("onStart()\n");
    }

    @Override
    protected void onResume(){
        super.onResume();
        ((TextView)findViewById(R.id.textViewState)).append("onResume()\n");
    }

    @Override
    protected void onPause(){
        super.onPause();
        ((TextView)findViewById(R.id.textViewState)).append("onPause()\n");
    }

    @Override
    protected void onStop(){
        super.onStop();
        ((TextView)findViewById(R.id.textViewState)).append("onStop()\n");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        ((TextView)findViewById(R.id.textViewState)).append("onRestart()\n");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        ((TextView)findViewById(R.id.textViewState)).append("onDestroy()\n");
    }
}
