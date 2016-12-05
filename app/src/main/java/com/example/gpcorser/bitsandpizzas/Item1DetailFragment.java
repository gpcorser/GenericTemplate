package com.example.gpcorser.bitsandpizzas;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

//import android.support.v4.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class Item1DetailFragment extends Fragment {

    public Item1DetailFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item1_detail, container, false);
        String detailText1 = getArguments().getString("VALUE");
        String detailText2 = "Class info not found";
        String detailText3 = "";
        int test = Item1.items[0].getLength();
        boolean found = false;

        int i = 0;
        while (i < Item1.items[0].getLength() && found != true) {
                if (Item1.items[i].getName().equals(detailText1)){
                    found = true;
                    detailText2 = Item1.items[i].getDescription();
                    detailText3 = "Prerequisites: " + (Item1.items[i].getPrerequisite());
                }
                i++;
            }

        TextView textView1 = (TextView)view.findViewById(R.id.item1_text1);
        textView1.setText(detailText1);
        TextView textView2 = (TextView)view.findViewById(R.id.item1_text2);
        textView2.setText(detailText2);
        TextView textView3 = (TextView)view.findViewById(R.id.item1_text3);
        textView3.setText(detailText3);

        return view;
    }


    public void onClick(final View v) { //check for what button is pressed
        getFragmentManager().popBackStackImmediate();
        }

    public void onClickBack(View view) {
        //FragmentManager fm = getFragmentManager();
        getFragmentManager().popBackStackImmediate();
            //Log.i("MainActivity", "popping backstack");
            //fm.popBackStack();
    }


}
