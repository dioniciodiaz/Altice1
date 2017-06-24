package com.example.dda.altice1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DDA on 24/06/2017.
 */

public class UserAdapter extends ArrayAdapter<User> {
    public UserAdapter (Context context, ArrayList<User> objects){
        super(context,0,objects);
    }

@Override
public View getView(int position, View convertView, ViewGroup parent){
    User user=getItem(position);
    if (convertView == null){
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.userlistitem,parent,false);
    }
    TextView tvname=(TextView)convertView.findViewById(R.id.name);

    TextView tvage=(TextView)convertView.findViewById(R.id.age);

    tvage.setText("Mi edad es "+user.getAge()+" y mi direccion es "+user.getAddress());
    tvname.setText(user.getName());

    return convertView;



    }
}