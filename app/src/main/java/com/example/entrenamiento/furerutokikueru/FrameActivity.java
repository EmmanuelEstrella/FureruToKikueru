package com.example.entrenamiento.furerutokikueru;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.entrenamiento.furerutokikueru.Adapters.UserAdapter;
import com.example.entrenamiento.furerutokikueru.Models.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FrameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int layout = getIntent().getExtras().getInt("layout");
        setContentView(layout);
        ListView listView = findViewById(R.id.list);
        if(listView != null){

            ArrayList<User> list = new ArrayList<>();
            for (int i = 0; i < 100 ; i++){
                list.add(new User("User "+(i+1), new Date(1519491188)));
            }
            listView.setAdapter(new UserAdapter(this,list));
            View header = LayoutInflater.from(this).inflate(R.layout.header_footer_layout, );
            ((TextView)header.findViewById(R.id.text)).setText("Header");
            View footer = LayoutInflater.from(this).inflate(R.layout.header_footer_layout,listView);
            ((TextView)footer.findViewById(R.id.text)).setText("Footer");
            listView.addFooterView(footer);
            listView.addHeaderView(header);

        }

        GridView gridView = findViewById(R.id.grid);
        if(gridView != null){
            List<String> list = new ArrayList<>();
            for (int i = 0; i < 100 ; i++){
                list.add(""+i);
            }
            gridView.setAdapter(new ArrayAdapter<String>(this, R.layout.list_item, R.id.text, list));
        }
    }
}
