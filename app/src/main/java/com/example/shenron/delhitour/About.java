package com.example.shenron.delhitour;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ScrollView;

public class About extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);


        ScrollView aboutView = (ScrollView)findViewById(R.id.about_view);
        aboutView.setBackgroundColor(Color.rgb(255, 117, 232));
    }

}
