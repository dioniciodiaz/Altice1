package com.example.dda.altice1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class GV extends AppCompatActivity {
GridView gv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gv);

        gv=(GridView) findViewById(R.id.gv);
        List<String> list=new ArrayList<>();
        for (int i=0; i<100; i++){
            list.add(Integer.toString(i+1));
        }
        gv.setAdapter(new ArrayAdapter<>(this,R.layout.textview,list));



    }
}
