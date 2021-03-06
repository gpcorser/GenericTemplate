package com.example.gpcorser.bitsandpizzas;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

//import android.support.v4.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class Item1bFragment extends Fragment {

    private ListView list;
    public int currentPosition = 0;

    public Item1bFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         ArrayAdapter<String> listAdapter ;

        View view = inflater.inflate(R.layout.fragment_item1b, container, false);
        list = (ListView)view.findViewById(R.id.list);
        String[] titles = getResources().getStringArray(R.array.item1b);
        list.setAdapter(new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_activated_1, titles));


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1,
                                    int position, long arg3) {
                // TODO Auto-generated method stub
                selectItem(position);

            }
        });
        return view;
    }


    private void selectItem (int position) {
        currentPosition = position;
        Fragment fragment;

        //switch(position) {
         //   case 0:
         //       fragment = new Item1DetailFragment();
         //       break;
         //   case 1:
          //      fragment = new Item1DetailFragment();
         //       break;
         //   case 2:
         //       fragment = new Item1DetailFragment();
         //       break;
         //   case 3:
         //       fragment = new Item1DetailFragment();
         //       break;
          //  default:
         //       fragment = new TopFragment();
         //       break;
        //    }

        fragment = new Item1DetailFragment();
        String val =(String) list.getItemAtPosition(position);

        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.addToBackStack(null);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        Bundle args = new Bundle();
        args.putString("VALUE", val);
        fragment.setArguments(args);

        ft.addToBackStack(null);

        ft.replace(R.id.content_frame, fragment, "visible_fragment");
        ft.commit();

    }

}
