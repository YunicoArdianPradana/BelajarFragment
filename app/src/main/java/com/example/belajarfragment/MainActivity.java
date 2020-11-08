package com.example.belajarfragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    Button btnFragment1, btnFragment2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFragment1 = findViewById(R.id.btn_fragment1);
        btnFragment2 = findViewById(R.id.btn_fragment2);

        btnFragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
//                fm.beginTransaction().add(R.id.container,new HomeFragment()).commit();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.container, new HomeFragment());
                ft.commit();
            }
        });
        btnFragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
//                fm.beginTransaction().add(R.id.container,new ChatFragment()).commit();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.container, new ChatFragment());
                ft.commit();
            }
        });

    }
}