package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    private int mColorResourceId;

    public SongAdapter(Activity context, ArrayList<Song> songs, int colorResourceId ) {
        super(context, 0, songs);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        parent.findViewById(R.id.list);
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView nameTextView = listItemView.findViewById(R.id.song_name);
        nameTextView.setText(currentSong.getName());

        TextView artistTextView = listItemView.findViewById(R.id.song_artist);
        artistTextView.setText(currentSong.getArtist());

        TextView durationTextView = listItemView.findViewById(R.id.duration_time);
        durationTextView.setText(currentSong.getDuration());

        View textContainer = listItemView.findViewById(R.id.color_list);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);


        return listItemView;
    }
}
