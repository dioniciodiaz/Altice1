package com.example.dda.altice1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnllv, btnflv, btnlv,  btngv, btnca;;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnllv=(Button) findViewById(R.id.btnllv);
        btnllv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent crusar = new Intent(MainActivity.this, LLVActivity.class);
                startActivity(crusar);
            }
        });

        btnflv=(Button) findViewById(R.id.btnflv);
        btnflv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent crusar = new Intent(MainActivity.this, FL.class);
                startActivity(crusar);
            }
        });

        btnlv=(Button) findViewById(R.id.btnlv);
        btnlv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent crusar = new Intent(MainActivity.this, LV.class);
                startActivity(crusar);
            }
        });

        btngv=(Button) findViewById(R.id.btngv);
        btngv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent crusar = new Intent(MainActivity.this, GV.class);
                startActivity(crusar);
            }
        });

        btnca=(Button) findViewById(R.id.btncustoma);
        btnca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent crusar = new Intent(MainActivity.this, CustomU.class);
                startActivity(crusar);
            }
        });
    }
}
