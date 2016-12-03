package com.example.gpcorser.bitsandpizzas;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * A simple {@link Fragment} subclass.
 */

public class Item5Fragment extends Fragment
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

    Integer[] imgID={
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
        View view = inflater.inflate(R.layout.fragment_item5, container, false);

        Item5Adapter adapter = new Item5Adapter(getActivity(), itemName, imgID);
        list = (ListView) view.findViewById(R.id.list);
        list.setAdapter(adapter);

        return view;

    }
}

