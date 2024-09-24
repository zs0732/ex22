package com.example.ex22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent si = getIntent();
        int x1 = si.getIntExtra("B" , -1);
        int x2 = si.getIntExtra("R" , -1);
    }




}