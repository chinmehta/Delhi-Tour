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

public class SightsActivity extends AppCompatActivity{



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<Word>();


        words.add(new Word("LOTUS TEMPLE", "4.4",R.drawable.lotus_temple));
        words.add(new Word("AKSHARDHAM", "4.6",R.drawable.akshardham));
        words.add(new Word("BANGLA SAHIB GURUDWARA", "4.8",R.drawable.bangla_sahib));
        words.add(new Word("NATIONAL GALLERY OF MODERN ART (NGMA)", "4.5",R.drawable.national_gallery));
        words.add(new Word("TUGHLAQABAD FORT", "4.0",R.drawable.tughluq_tomb));
        words.add(new Word("TOMB OF SAFDARJANG", "4.3",R.drawable.tomb_of_safdarjang));
        words.add(new Word("PURANA QILA AND NATIONAL ZOOLOGICAL PARK", "4.1",R.drawable.purana_qila));
        words.add(new Word("AGRASEN KI BAOLI", "4.1",R.drawable.agrasen_ki_baoli));
        words.add(new Word("GARDEN OF FIVE SENSES", "3.9",R.drawable.garden_of_five));
        words.add(new Word("HAUZ KHAS VILLAGE AND DEER PARK", "4.3",R.drawable.hauz_khas));
        words.add(new Word("ISKCON TEMPLE", "4.5",R.drawable.iskcon_temple));
        words.add(new Word("NIZAMUDDIN DARGAH AND NIZAMUDDIN KI BAOLI", "4.1",R.drawable.hazrat_nizamuddin));
        words.add(new Word("LODHI GARDEN", "4.5",R.drawable.lodhi_garden));
        words.add(new Word("SAROJINI MARKET", "4.2",R.drawable.sarojini_nagar_market));
        words.add(new Word("DILLI HAAT", "4.1",R.drawable.delhi_haat));
        words.add(new Word("INDIA HABITAT CENTRE", "4.6",R.drawable.india_habitat_centre));
        words.add(new Word("INDIA GATE", "4.6",R.drawable.india_gate));
        words.add(new Word("QUTUB MINAR", "4.5",R.drawable.qutub_minar));
        words.add(new Word("RED FORT AND CHANDNI CHOWK", "4.4",R.drawable.red_fort));
        words.add(new Word("HUMAYUN’S TOMB", "4.5",R.drawable.humayuns_tomb));
        words.add(new Word("RASHTRAPATI BHAWAN", "4.6",R.drawable.rashtrapati_bhawan));
        words.add(new Word("CONNAUGHT PLACE, JANPATH AND MANDI HOUSE", "4.0",R.drawable.cp_janpath));
        words.add(new Word("RAJGHAT", "4.4",R.drawable.rajghat));


        //Create an {@link ArrayAdapter}, whose data source is list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource define in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter adapter = new WordAdapter(this, words,R.color.sights);
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
