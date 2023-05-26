package io.majorproject.remake;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {


    //private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*button1=findViewById(R.id.open_camera);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,second_main.class);
                startActivity(intent);
            }
        });*/
        Button btnLib=findViewById(R.id.open_3d_lib);
        btnLib.setOnClickListener(v -> {
            Intent intent=new Intent(MainActivity.this,second_main.class);
            startActivity(intent);
        });

        Button btnMenu=findViewById(R.id.menubtn);
        btnMenu.setOnClickListener(v -> {
            Intent intent=new Intent(MainActivity.this,menu_main.class);
            startActivity(intent);
        });

        /*Button btnHome=findViewById(R.id.homebtn);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(second_main.this,MainActivity.class);
                startActivity(intent);
            }
        });

        Button btnHome2=findViewById(R.id.homebtn2);
        btnHome2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(menu_main.this,
                        MainActivity.class);
                startActivity(intent);
            }
        });*/

        //fragment manager to manage code

        FragmentManager fragmentManager = getSupportFragmentManager();

        //Code for Ar tech fragment
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnAr= findViewById(R.id.arbtn);
        btnAr.setOnClickListener(v -> fragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView2,ARFragment.class,null)
                .setReorderingAllowed(true).
                addToBackStack("NAME").commit());

        //Code for  About us fragment
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnAbout= findViewById(R.id.aboutbtn);
        btnAbout.setOnClickListener(v -> fragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView2,AboutUsFragment.class,null)
                .setReorderingAllowed(true).
                addToBackStack("NAME").commit());

        //Code for Settings Fragment
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnSettings= findViewById(R.id.setbtn);
        btnSettings.setOnClickListener(v -> fragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView2, SettingsFragment.class,null)
                .setReorderingAllowed(true).
                addToBackStack("NAME").commit());

    }
}