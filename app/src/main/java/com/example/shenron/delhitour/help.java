package com.example.shenron.delhitour;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class help extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);

        LinearLayout aboutView = (LinearLayout) findViewById(R.id.help_layout);
        aboutView.setBackgroundColor(Color.rgb(250, 255, 122));
    }
}
