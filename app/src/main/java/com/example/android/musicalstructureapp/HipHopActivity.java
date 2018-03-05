package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class HipHopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("God's Plan", "Drake", "3:19", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Finesse", "Bruno Mars & Cardi B", "3:37", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Look Alive", "BlocBoy JB featuring Drake", "3:01", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Rockstar", "Post Malone featuring 21 Savage", "3:38", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("All The Stars", "Kendrick Lamar & SZA", "3:52", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Pray For Me", "The Weeknd & Kendrick Lamar", "3:31", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Stir Fry", "Migos", "3:10", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Let You Down", "NF", "3:32", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Him & I", "G-Eazy &  Halsey", "4:29", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Love.", "Kendrick Lamar featuring Zacari", "3:33", (ImageView) findViewById(R.id.play_song)));

        SongAdapter songAdapter = new SongAdapter(this, songs, R.color.colorHipHop);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(songAdapter);

    }
}

