package com.example.android.quakereport;

/**
 * Created by johnnylee on 3/18/17.
 */

public class Earthquake {
    private String mMagitude;
    private String mLocation;
    private long mTimeInMilliseconds;

    public String getMangitude() {
        return mMagitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public Earthquake(String magnitude, String location, long timeInMilliseconds) {
        this.mMagitude = magnitude;
        this.mLocation = location;
        this.mTimeInMilliseconds = timeInMilliseconds;
    }
}

