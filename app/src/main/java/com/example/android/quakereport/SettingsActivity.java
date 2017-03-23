package com.example.android.quakereport;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by johnnylee on 3/23/17.
 */

public class SettingsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);
    }

    public static class EarthquakePreferenceFragment extends PreferenceFragment {

    }
}
