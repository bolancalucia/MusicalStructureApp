package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ElectronicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("The Middle", "Zedd, Maren Morris & Grey", "3:05", R.id.play_song));
        songs.add(new Song("Wolves", "Selena Gomez X Marshmello", "3:18", R.id.play_song));
        songs.add(new Song("Something Just Like This", "The Chainsmokers & Coldplay", "4:07", R.id.play_song));
        songs.add(new Song("Let Me Go", "Hailee Steinfeld & Alesso featuring Watt", "2:55", R.id.play_song));
        songs.add(new Song("Silence", "Marshmello featuring Khalid", "3:01", R.id.play_song));
        songs.add(new Song("I Miss You", "Clean Bandit featuring Julia Michaels", "3:26", R.id.play_song));
        songs.add(new Song("No Promises", "Cheat Codes Featuring Demi Lovato", "3:43", R.id.play_song));
        songs.add(new Song("Best Friend", "Sofi Tukker featuring NERVO & The Knocks", "3:05", R.id.play_song));
        songs.add(new Song("Mad Love", "Sean Paul & David Guetta featuring Becky G", "3:20", R.id.play_song));
        songs.add(new Song("Miss You", "Cashmere Cat, Major Lazer & Tory Lanez", "3:06", R.id.play_song));

        SongAdapter songAdapter = new SongAdapter(this, songs, R.color.colorElectronic);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(songAdapter);

    }
}
