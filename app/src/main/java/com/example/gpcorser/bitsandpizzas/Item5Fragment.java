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

    String[] itemDesc ={
            "Department Chair",
            "Dean of the College of Science",
            "Associate Dean of the College of Science",
            "Associate Professor of CSIS",
            "Assistant Professor of CSIS",
            "Lecturer of CSIS",
            "Assistant Professor of CSIS",
            "Professor of CSIS",
            "Assistant Professor of CSIS",
            "Adjunct Faculty",
            "Adjunct Faculty",
            "Adjunct Faculty",
            "Adjunct Faculty",
            "Adjunct Faculty",
            "Adjunct Faculty",
            "Adjunct Faculty",
            "Adjunct Faculty"
    };

    String[] itemContact ={
            "Science East 178  |  989-964-2044",
            "Pioneer Hall 236B |  989-964-4144",
            "Pioneer Hall 236  |  989-964-4144",
            "Science East 175  |  989-964-4198",
            "Science East 179  |  989-964-2756",
            "Science East 173  |  989-964-4483",
            "Science East 172  |  989-964-4191",
            "Science East 176  |  989-964-4896",
            "Science East 177  |  989-964-2528",
            "989-964-4050",
            "989-964-4050",
            "989-964-4050",
            "989-964-4050",
            "989-964-4050",
            "989-964-4050",
            "989-964-4050",
            "989-964-4050"
    };

    public Item5Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_item5, container, false);

        Item5Adapter adapter = new Item5Adapter(getActivity(), itemName, imgID, itemDesc, itemContact);
        list = (ListView) view.findViewById(R.id.list);
        list.setAdapter(adapter);

        return view;

    }
}

