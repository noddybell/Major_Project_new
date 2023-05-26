package io.majorproject.remake;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

public class second_main extends AppCompatActivity {

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_main);

        getSupportActionBar().setTitle("second page_3D Library");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }
}