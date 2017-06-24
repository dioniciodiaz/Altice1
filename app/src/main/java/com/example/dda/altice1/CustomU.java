package com.example.dda.altice1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CustomU extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_u);
        new User("", "", 0);
        ArrayList<User> listU = new ArrayList<>();
        listU.add(new User("juan","pantoja",19));
        listU.add(new User("pedro","los mina",32));
        listU.add(new User("maria","el millon",45));
        listU.add(new User("veronica","bani",95));


        UserAdapter adap= new UserAdapter(this,listU);
        ListView lv=(ListView)findViewById(R.id.customlv);
        lv.setAdapter(adap);



    }
}
