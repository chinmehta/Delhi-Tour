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

public class RestaurantsActivity extends AppCompatActivity {


        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.word_list);

            final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Masala Library", "Janpath",R.drawable.masala_library));
        words.add(new Word("Indian Accent - The Manor", "Friends Colony",R.drawable.indian_accent));
        words.add(new Word("On the Waterfront - The Lodhi", "The Lodhi, Lodhi Road",R.drawable.on_the_waterfront));
        words.add(new Word("Sevilla - The Claridges", "The Claridges, Aurangzeb Road",R.drawable.sevilla_claridges));
        words.add(new Word("Lakhori - Haveli Dharampura", "Chandni Chowk",R.drawable.lakhori_dharampura));
        words.add(new Word("SET'Z", "DLF Emporio Mall, Vasant Kunj",R.drawable.setz));
        words.add(new Word("Tamra - Shangri-La's - Eros Hotel", "Shangri La's - Eros hotel, Janpath",R.drawable.tamra));
        words.add(new Word("Dum-Pukht - ITC Maurya", "ITC Maurya, Chanakyapuri",R.drawable.itc));
        words.add(new Word("FIO Cookhouse and Bar", "Epicuria Food Mall, Nehru Place",R.drawable.cookhouse));
        words.add(new Word("The Great Kabab Factory - Radisson Blu Plaza Delhi", "Radisson Blu Plaza Delhi, Mahipalpur",R.drawable.the_great_kabab_factory));


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
