package com.example.gpcorser.bitsandpizzas;

import android.app.ListFragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * A simple {@link Fragment} subclass.
 */

public class Item5Fragment extends ListFragment
{
    ListView list;
    String[] itemName ={
            "Il-Hyung Cho",
            "Frank Hall",
            "Andrew Chubb",
            "Moe Bidgoli",
            "George Corser",
            "Chad Dewey",
            "Poonam Dharam",
            "Scott James",
            "Khandaker Abir Rahman",
            "Richard Beyers",
            "Jesse Grekowics",
            "Gregory McNish",
            "Nancy Samolewski",
            "Evelyn Schenk",
            "Michael Stackhouse",
            "Roger Yerion",
            "Joan Zito"
    };

    Integer[] imgid={
            R.drawable.cho,
            R.drawable.hall,
            R.drawable.chubb,
            R.drawable.bidgoli,
            R.drawable.corser,
            R.drawable.nophoto,
            R.drawable.dharam,
            R.drawable.nophoto,
            R.drawable.rahman,
            R.drawable.beyers,
            R.drawable.nophoto,
            R.drawable.nophoto,
            R.drawable.nophoto,
            R.drawable.nophoto,
            R.drawable.stackhouse,
            R.drawable.nophoto,
            R.drawable.nophoto,
    };

    public Item5Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_item5, container, false);

        itemName = getActivity().getResources().getStringArray(R.array.item5names);
        list = (ListView) getActivity().findViewById(R.id.list);

        list.setAdapter(new ArrayAdapter<String>(getActivity().getApplicationContext(),
                android.R.layout.simple_list_item_1, itemName));

        return view;

        //return inflater.inflate(R.layout.fragment_item5, container, false);
    }

}
