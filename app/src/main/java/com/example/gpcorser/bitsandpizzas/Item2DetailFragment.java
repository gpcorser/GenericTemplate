package com.example.gpcorser.bitsandpizzas;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

//import android.support.v4.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class Item2DetailFragment extends Fragment {

    public Item2DetailFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item2_detail, container, false);
        String detailText1 = getArguments().getString("VALUE");
        String detailText2 = "Class info not found";
        String detailText3 = "";
        boolean found = false;

        int i = 0;
        while (i < Item2.items[0].getLength() && found != true) {
                if (Item2.items[i].getName().equals(detailText1)){
                    found = true;
                    detailText2 = Item1.items[i].getDescription();
                    detailText3 = "Prerequisites: " + (Item1.items[i].getPrerequisite());
                }
                i++;
            }

        TextView textView1 = (TextView)view.findViewById(R.id.item2_text1);
        textView1.setText(detailText1);
        TextView textView2 = (TextView)view.findViewById(R.id.item2_text2);
        textView2.setText(detailText2);
        TextView textView3 = (TextView)view.findViewById(R.id.item2_text3);
        textView3.setText(detailText3);

        return view;
    }

}
