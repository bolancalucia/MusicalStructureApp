package com.example.android.musicalstructureapp;

import android.widget.ImageView;

public class Song {
    private String mName;
    private String mArtist;
    private String mDuration;
    private ImageView mPlay;

    public Song(String name, String artist, String duration, ImageView play) {
        mName = name;
        mArtist = artist;
        mDuration = duration;
        mPlay = play;
    }

    public String getName() {
        return mName;
    }

    public String getArtist() {
        return mArtist;
    }

    public String getDuration() {
        return mDuration;
    }

    public ImageView getPlay() {
        return mPlay;
    }

}
