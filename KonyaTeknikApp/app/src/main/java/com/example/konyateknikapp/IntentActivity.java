package com.example.konyateknikapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IntentActivity extends AppCompatActivity {

    public void turnBack(View view) {
        Intent in = new Intent(IntentActivity.this, MainActivity.class);
        startActivity(in);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
    }
}
