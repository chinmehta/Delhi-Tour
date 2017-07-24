package com.example.shenron.delhitour;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import java.util.ArrayList;

public class MuseumsActivity extends AppCompatActivity{



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<Word>();


        words.add(new Word("National Gandhi Museum", "4.4"));
        words.add(new Word("National Rail Museum", "4.3"));
        words.add(new Word("Indian Air Force Museum", "4.4"));
        words.add(new Word("National Handicrafts and Handlooms Museum", "4.5"));
        words.add(new Word("National Police Museum", "3"));
        words.add(new Word("National Agricultural Science Museum", "4.6"));
        words.add(new Word("National Children's Museum", "2.6"));

        //Create an {@link ArrayAdapter}, whose data source is list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource define in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter adapter = new WordAdapter(this, words);
        //find {@link ListView} object in the hierarchy of the {@link Activity}
        //There should be a {@link ListView} with the ID called list, whic  h is declared in
        //word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);
        //Make the {@link ListView} use the {@link ArrayAdapter}
        // we created above so that the {@link ListView } will display list item
        // for each word in the list of the words. Do this by calling setAdapter method on the {@link ListView}
        // object and pass in 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);


    }


}
