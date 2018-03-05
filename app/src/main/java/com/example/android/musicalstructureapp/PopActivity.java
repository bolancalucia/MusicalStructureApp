package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class PopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Perfect", "Ed Sheeran", "4:23", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Let You Down", "NF", "3:32", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("New Rules", "Dua Lipa", "3:29", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Him & I", "G-Eazy &  Halsey", "4:29", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("How Long", "Charlie Puth", "3:18", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Finesse", "Bruno Mars & Cardi B", "3:37", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Wolves", "Selena Gomez X Marshmello", "3:18", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Lights Down Low", "MAX featuring gnash", "3:44", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Havana", "Camila Cabello featuring Young Thug", "3:37", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Bad At Love", "Halsey", "3:01", (ImageView) findViewById(R.id.play_song)));

        SongAdapter songAdapter = new SongAdapter(this, songs, R.color.colorPop);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(songAdapter);
    }
}
