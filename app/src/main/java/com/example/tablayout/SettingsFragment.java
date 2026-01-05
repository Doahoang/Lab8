package com.example.tablayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class SettingsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        TextView tv = new TextView(getContext());
        tv.setText("SETTINGS");
        tv.setTextSize(24);
        tv.setGravity(Gravity.CENTER);
        tv.setBackgroundColor(Color.YELLOW);

        return tv;
    }
}

