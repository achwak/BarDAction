package com.example.reikalovely.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Reika Lovely on 15/03/2016.
 */
public class PlaceholderFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_main,container,false);
        TextView textView=(TextView)view.findViewById(R.id.section_label);

        int i= getArguments().getInt("pos");
        if (i==0){
            textView.setText("Fragment 0");
        }
        if (i==1){
            textView.setText("Fragment 1");

        }
        if (i==2){
            textView.setText("Fragment 2");

        }
        return view;
    }
}
