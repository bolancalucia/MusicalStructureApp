package com.example.android.musicalstructureapp;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ImageView;
        import android.widget.ListView;

        import java.util.ArrayList;

public class RockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Thunder", "Imagine Dragons", "3:07", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Feel It Still ", "Portugal. The Man", "2:43", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Believer", "Imagine Dragons", "3:24", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Whatever It Takes", "Imagine Dragons", "3:21", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("One Foot", "WALK THE MOON", "4:21", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("No Roots", "Alice Merton", "3:56", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Sit Next To Me", "Foster The People", "4:03", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Walk On Water", "Thirty Seconds To Mars", "3:08", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Rx (Medicate)", "Theory Of A Deadman", "3:53", (ImageView) findViewById(R.id.play_song)));
        songs.add(new Song("Thought Contagion", "Muse", "3:26", (ImageView) findViewById(R.id.play_song)));

        SongAdapter songAdapter = new SongAdapter(this, songs, R.color.colorRock);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
             // TO DO
            }
        });
    }
}
