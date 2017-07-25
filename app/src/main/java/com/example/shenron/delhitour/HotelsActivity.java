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

public class HotelsActivity extends AppCompatActivity{



            protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.word_list);

            final ArrayList<Word> words = new ArrayList<Word>();


                words.add(new Word("Le Meridien", "4.5",R.drawable.meridian));
                words.add(new Word("Vivanta by Taj", "4.4",R.drawable.vivanta_by_taj));
                words.add(new Word("Holiday Inn New Delhi", "4.3",R.drawable.holiday_inn));
                words.add(new Word("Radisson Blu", "4.3",R.drawable.radisson_blu));
                words.add(new Word("Taj Mahal Hotel", "4.5",R.drawable.taj));
                words.add(new Word("Eros Hotel", "4.2",R.drawable.eros_hotel));
                words.add(new Word("Red Fox Hotel", "3.9",R.drawable.red_fox));
                words.add(new Word("JW Marriott Hotel", "4.5",R.drawable.jw_marriott));
                words.add(new Word("The Umrao", "4.4",R.drawable.the_umrao));
                words.add(new Word("Shangri-La's Eros Hotel", "4.4",R.drawable.shangri_la_hotel));
                words.add(new Word("Hyatt Regency Delhi", "4.4",R.drawable.hyatt_regency));
                words.add(new Word("The Claridges New Delhi", "4.4",R.drawable.the_claridges));

                //Create an {@link ArrayAdapter}, whose data source is list of Strings. The
                // adapter knows how to create layouts for each item in the list, using the
                // simple_list_item_1.xml layout resource define in the Android framework.
                // This list item layout contains a single {@link TextView}, which the adapter will set to
                // display a single word.
                WordAdapter adapter = new WordAdapter(this, words,R.color.hotels);
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
