package com.example.android.musicalstructureapp;

public class Song {
    private String mName;
    private String mArtist;
    private String mDuration;
    private int mPlayResourceId;

    public Song(String name, String artist, String duration, int playResourceId) {
        mName = name;
        mArtist = artist;
        mDuration = duration;
        mPlayResourceId = playResourceId;
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

}
