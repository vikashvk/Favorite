package com.example.application.goat;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

Fragment f;
FragmentTransaction ft;
FragmentManager fm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AajaFragment(f);
    }
    public void AajaFragment(Fragment f){
        fm=getSupportFragmentManager();
        ft=fm.beginTransaction();
        ft.replace(R.layout.great);
        ft.commit();
    }
}
