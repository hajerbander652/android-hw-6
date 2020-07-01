package com.example.aclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
movie it = new movie("it","jack",'6','7',"13");
        movie wwz = new movie("wwz","jj",'9','6',"16");
    }
}