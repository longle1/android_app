package com.example.final_project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment {

    private TextView textView;

    public Fragment2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2, container, false);

        textView = view.findViewById(R.id.text);

        return view;
    }

    public void updateText(int buttonId) {
        String text = "";

        switch (buttonId) {
            case 1:
                text = "Button 1 Clicked";
                break;
            case 2:
                text = "Button 2 Clicked";
                break;
            case 3:
                text = "Button 3 Clicked";
                break;
        }

        textView.setText(text);
    }
}