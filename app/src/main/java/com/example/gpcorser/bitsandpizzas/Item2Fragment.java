package com.example.gpcorser.bitsandpizzas;

import android.app.FragmentTransaction;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Item2Fragment extends Fragment {

    private ListView list;
    public int currentPosition = 0;
    public Item2Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_item2, container, false);
        list = (ListView)view.findViewById(R.id.list);
        String[] titles = getResources().getStringArray(R.array.item2);
        list.setAdapter(new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_activated_1, titles));

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1,
                                    int position, long arg3) {
                selectItem(position);

            }
        });
        return view;
    }

    private void selectItem (int position) {
        currentPosition = position;
        android.app.Fragment fragment;
        switch(position) {
            case 0:
                fragment = new Item2aFragment();
                break;
            case 1:
                fragment = new Item2bFragment();
                break;
            case 2:
                fragment = new Item2cFragment();
                break;
            case 3:
                fragment = new Item2dFragment();
                break;
            case 4:
                fragment = new Item2eFragment();
                break;
            default:
                fragment = new TopFragment();
                break;
        }
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.content_frame, fragment, "visible_fragment");
        ft.addToBackStack(null);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();
    }

}
