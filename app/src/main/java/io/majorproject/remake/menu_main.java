package io.majorproject.remake;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class menu_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_main);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Menu Page");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}