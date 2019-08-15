package com.umbrafox.greenhug;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    static final String KEY_COUNTER = "COUNTER";
    private int mCounter=0;

    public void onClickCounter(View view) {
        mCounter++;
        ((TextView)findViewById(R.id.textViewCounter))
                .setText("Counter: " + mCounter);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_COUNTER,mCounter);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mCounter=savedInstanceState.getInt(KEY_COUNTER);
    }

    public void onClickClose(View view){
        Intent returnIntent = new Intent();
        returnIntent.putExtra(MainActivity.REQUEST_RESULT, 42);
        setResult(RESULT_OK, returnIntent);
        finish();
    }

    //types
    //echeveria
    //aeonium
    //cotelydon
    //sempervivum
    //crassula
    //kalanchoe
    //sedum
    //senecio
    //aloe
    //cactus

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView = (TextView) findViewById(R.id.textViewText);
        if (getIntent() != null &&
                getIntent().hasExtra(Intent.EXTRA_TEXT)){
            textView.setText(getIntent().getStringExtra(Intent.EXTRA_TEXT));
        }
        SharedPreferences settings = getPreferences(MODE_PRIVATE);
        int defaultCounter = 0;
        mCounter = settings.getInt(KEY_COUNTER, defaultCounter);
        ((TextView)findViewById(R.id.textViewCounter))
                .setText("Counter: " + mCounter);
    }

    @Override
    protected void onPause(){
        super.onPause();
        SharedPreferences settings = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt(KEY_COUNTER, mCounter);
        editor.commit();
    }
}
