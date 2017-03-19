package com.example.android.quakereport;

/**
 * Created by johnnylee on 3/18/17.
 */

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public Earthquake(double magnitude, String location, long timeInMilliseconds) {
        this.mMagnitude = magnitude;
        this.mLocation = location;
        this.mTimeInMilliseconds = timeInMilliseconds;
    }
}

