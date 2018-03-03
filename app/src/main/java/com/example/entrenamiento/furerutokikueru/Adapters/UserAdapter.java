package com.example.entrenamiento.furerutokikueru.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.entrenamiento.furerutokikueru.Models.User;
import com.example.entrenamiento.furerutokikueru.R;

import java.util.ArrayList;

/**
 * Created by Emmanuel on 24/02/2018.
 */

public class UserAdapter extends ArrayAdapter<User> {

    public UserAdapter(Context context, ArrayList<User> users) {
        super(context,0 , users);
    }

    public UserAdapter(Context context,int layoutId, ArrayList<User> users) {
        super(context,layoutId , users);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        User user = getItem(position);
        if(convertView == null) {

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user, parent, false);
        }

        TextView tvName = convertView.findViewById(R.id.tvName);
        TextView tvBirthday = convertView.findViewById(R.id.tvBirthday);

        tvName.setText(user.name);
        tvBirthday.setText(user.birthday.toString());
        return convertView;
    }
}
