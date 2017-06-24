package com.example.dda.altice1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class LV extends AppCompatActivity {
ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lv);
        lv=(ListView) findViewById(R.id.lv);
        List<String> list=new ArrayList<>();
        for (int i=0; i<100; i++){
            list.add(Integer.toString(i+1));
        }
        lv.setAdapter(new ArrayAdapter<>(this,R.layout.textview,list));












    }
}
