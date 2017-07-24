package com.example.shenron.delhitour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import static com.example.shenron.delhitour.R.layout.about;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView intro = (ImageView) findViewById(R.id.about_image_view);

        intro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent introIntent = new Intent(MainActivity.this,About.class);
                startActivity(introIntent);
            }
        });
    }
}
