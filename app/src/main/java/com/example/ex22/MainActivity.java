package com.example.ex22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.ex22.R;

public class MainActivity extends AppCompatActivity {

    int xBlue, xRed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btnBlue = (Button) findViewById(R.id.btnBlue);
        Button btnRed = (Button) findViewById(R.id.btnRed);
        xBlue = 0;
        xRed = 0;


        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xBlue++;


            }
        });

        btnRed.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                xRed = xRed + 2;
                return false;
            }
        });

    }


    public void sendToActivity2(View view) {
        Intent si = new Intent(this, com.example.ex22.MainActivity2.class);
        si.putExtra("B",xBlue);
        si.putExtra("R",xRed);
        startActivity(si);
    }
}
