package com.example.android.quakereport;

/**
 * Created by johnnylee on 3/18/17.
 */

public class Earthquake {
    private String mMagitude;
    private String mLocation;
    private String mDate;

    public String getMangitude() {
        return mMagitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getDate() {
        return mDate;
    }

    public Earthquake(String magnitude, String location, String date) {
        this.mMagitude = magnitude;
        this.mLocation = location;
        this.mDate = date;
    }
}

