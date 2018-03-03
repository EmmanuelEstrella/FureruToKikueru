package com.example.entrenamiento.furerutokikueru;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class AjinActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ajin_activity);
        LinearLayout ajinLayout = findViewById(R.id.ajin);
        int childsCount = ajinLayout.getChildCount();
        for(int i = 0; i <  childsCount; i++){
            ajinLayout.getChildAt(i).setOnClickListener(this);
        }

    }

    @Override
    public void onClick(View view) {
        Class activityClass = FrameActivity.class;
        int layout = 0;

        switch (view.getId()) {
            case R.id.linear_vertical:
                layout = R.layout.activity_linear_vertical;

                break;
            case R.id.linear_horizontal:
                layout = R.layout.activity_linear_horizontal;

                break;
            case R.id.relative:
                layout = R.layout.activity_relative;
                break;
            case R.id.list:
                layout = R.layout.activity_list;
                break;
            case R.id.frame:
                layout = R.layout.activity_frame;
                break;
            case R.id.table:
                layout = R.layout.activity_table;
                break;
            case R.id.grid:
                layout = R.layout.activity_grid;
                break;
            default:
                layout = R.layout.activity_relative;


                break;
        }

        Bundle bundle = new Bundle();
        bundle.putInt("layout",layout);
        Intent activityIntent = new Intent(this, activityClass);
        activityIntent.putExtras(bundle);
        startActivity(activityIntent);

    }
}
